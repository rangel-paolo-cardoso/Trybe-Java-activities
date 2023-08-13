package com.rangel;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.rangel.entities.Application;
import com.rangel.entities.Datacenter;
import com.rangel.entities.Server;
import com.rangel.services.IService;

public class AppTest {

    @BeforeAll
    public static void populateDB() {
        Application app1 = new Application();
        app1.setName("FutuereH");
        app1.setDescription("Java");

        Application app2 = new Application();
        app2.setName("Agro Techfields");
        app2.setDescription("Python");

        Application app3 = new Application();
        app3.setName("Trybe Course");
        app3.setDescription("Javascript");

        Datacenter datacenter1 = new Datacenter();
        datacenter1.setName("Cerrado");
        datacenter1.setLocation("Brasilia");

        Server servidor1D1 = new Server();
        servidor1D1.setName("LoboGuara");
        servidor1D1.setDatacenter(datacenter1);
        datacenter1.addServer(servidor1D1);

        // Setting App1 to the server 1 on the datacenter 1
        servidor1D1.addApplication(app1);

        // Setting App2 to the server 1 on the datacenter 1
        servidor1D1.addApplication(app2);

        // Setting App3 to the server 1 on the datacenter 1
        servidor1D1.addApplication(app3);

        Server servidor2D1 = new Server();
        servidor2D1.setName("Ariranha");
        servidor2D1.setDatacenter(datacenter1);
        datacenter1.addServer(servidor2D1);

        // Setting App2 to the server 2 on the datacenter 1
        servidor2D1.addApplication(app2);

        // Setting App3 to the server 3 on the datacenter 1
        servidor2D1.addApplication(app3);

        DatacenterService service = new DatacenterService();
        service.save(datacenter1);

        Datacenter datacenter2 = new Datacenter();
        datacenter2.setName("Mata Atlântica");
        datacenter2.setLocation("São Paulo");

        Server servidor1D2 = new Server();
        servidor1D2.setName("Tamanduá Bandeira");
        servidor1D2.setDatacenter(datacenter2);
        datacenter2.addServer(servidor1D2);

        Server servidor2D2 = new Server();
        servidor2D2.setName("Jaguatirica");
        servidor2D2.setDatacenter(datacenter2);
        datacenter2.addServer(servidor2D2);

        service.save(datacenter2);

        // Setting App3 to the server 1 on the datacenter 2
        servidor1D2.addApplication(app3);

        // Setting App1 to the server 2 on the datacenter 2
        servidor2D2.addApplication(app1);

        // Setting App2 to the server 2 on the datacenter 2
        servidor2D2.addApplication(app2);

        service.update(datacenter2);
    }

    @Test
    @DisplayName("1 - Verifies if the service classes implement ServiceInterface")
    public void testServiceImplementation() {
        AplicacaoService app = new AplicacaoService();
        assertEquals(1, app.getClass().getInterfaces().length);
        assertTrue(app.getClass().getInterfaces()[0].getName()
                .equals("com.trybe.acc.java.datacenter.service.ServiceInterface"));

        ServerService server = new ServerService();
        assertEquals(1, server.getClass().getInterfaces().length);
        assertTrue(server.getClass().getInterfaces()[0].getName()
                .equals("com.trybe.acc.java.datacenter.service.ServiceInterface"));

        DatacenterService datacenter = new DatacenterService();
        assertEquals(1, datacenter.getClass().getInterfaces().length);
        assertTrue(datacenter.getClass().getInterfaces()[0].getName()
                .equals("com.trybe.acc.java.datacenter.service.ServiceInterface"));

        Stream.of(IService.class.getDeclaredMethods()).forEach(method -> {
            assertTrue(method.getName().equals("update") || method.getName().equals("list")
                    || method.getName().equals("delete") || method.getName().equals("save")
                    || method.getName().equals("findById"));
        });
    }

    @Test
    @DisplayName("2 - Verifies if the insertion of the entity Datacenter is correctly done")
    public void testInsertDatacenter() {
        DatacenterService service = new DatacenterService();
        List<Datacenter> data = service.list();
        assertEquals(2, data.size());
    }

    @Test
    @DisplayName("3 - Veriflies if the insertion of the entity Server is correctly done")
    public void testInsertServer() {
        ServerService service = new ServerService();
        List<Server> data = service.list();
        assertEquals(4, data.size());
    }

    @Test
    @DisplayName("4 - Verifies if the insertion of the entity Application is correctly done")
    public void testInsertApplication() {
        ApplicationService service = new ApplicationService();
        List<Application> data = service.list();
        assertEquals(3, data.size());
    }

    @Test
    @DisplayName("5 - Tests OneToMany relationship (Datacenter <-> Server)")
    public void testOneToManyRelationship() {
        ServerService service = new ServerService();
        List<Server> data = service.list();
        assertEquals(4, data.size());

        data.forEach(s -> {
            if (s.getName().equals("Ariranha") || s.getName().equals("LoboGuara")) {
                assertEquals("Cerrado", s.getDatacenter().getName());
            } else if (s.getName().equals("Tamanduá Bandeira") || s.getName().equals("Jaguatirica")) {

            } else {
                fail("Wrong relationships");
            }
        });
    }

    @Test
    @DisplayName("6 - Tests ManyToMany relationship (Server <-> Application)")
    public void testManyToManyRelationship() {
        ServerService service = new ServerService();
        List<Server> data = service.list();
        assertEquals(4, data.size());

        data.forEach(s -> {
            if (s.getName().equals("Ariranha")) {
                s.getApplications().forEach(a -> {
                    assertEquals(true,
                            a.getName().equals("Trybe Course") || a.getName().equals("Agro Techfields"));
                });
            } else if (s.getName().equals("LoboGuara")) {
                s.getApplications().forEach(a -> {
                    assertEquals(true, a.getName().equals("Trybe Course")
                            || a.getName().equals("Agro Techfields") || a.getName().equals("FutuereH"));
                });
            } else if (s.getName().equals("Tamanduá Bandeira")) {
                s.getApplications().forEach(a -> {
                    assertEquals(true, a.getName().equals("Trybe Course"));
                });
            } else if (s.getName().equals("Jaguatirica")) {
                s.getApplications().forEach(a -> {
                    assertEquals(true,
                            a.getName().equals("FutuereH") || a.getName().equals("Agro Techfields"));
                });
            } else {
                fail("Wrong relationships");
            }
        });
    }

    @Test
    @DisplayName("7 - Tests Datacenter entity remotion")
    public void testDatacenterRemotion() {

        Datacenter datacenter = new Datacenter();
        datacenter.setName("Test");

        DatacenterService service = new DatacenterService();
        service.save(datacenter);
        service.delete(datacenter.getId());

        assertNull(service.findById(datacenter.getId()));
    }

    @Test
    @DisplayName("8 - Tests Server entity remotion")
    public void testServerRemotion() {

        Server server = new Server();
        server.setNome("Test");

        ServerService service = new ServerService();
        service.save(server);
        service.delete(server.getId());

        assertNull(service.findById(server.getId()));
    }

    @Test
    @DisplayName("9 - Tests Application entity remotion")
    public void testApplicationRemotion() {

        Application application = new Application();
        application.setNome("Test");

        ApplicationService service = new ApplicationService();
        service.save(application);
        service.delete(application.getId());

        assertNull(service.findById(application.getId()));
    }

    @AfterAll
    public static void clearDB() {
        DatacenterService service = new DatacenterService();
        service.delete((long) 1);
        service.delete((long) 2);

        ApplicationService appService = new ApplicationService();
        appService.delete((long) (1));
        appService.delete((long) (2));
        appService.delete((long) (3));
    }
}
