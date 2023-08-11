package com.rangel;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.rangel.entities.Application;
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
}
