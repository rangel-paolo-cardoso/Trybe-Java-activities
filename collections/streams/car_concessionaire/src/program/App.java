package program;

import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        VehicleOperations vehicleOperations = new VehicleOperations();

        Stream<String> carsStream = Stream.of("Gol", "Gol", "Palio", "Siena", "Uno", "Uno", "Palio");
        int numberOfCars = vehicleOperations.numberOfDifferentVehiclesSold(carsStream);
        System.out.println("Number of cars sold: " + numberOfCars);

        Stream<Vehicle> vehicleStream = Stream.of(
                new Vehicle("Gol"), new Vehicle("Gol"),
                new Vehicle("Palio"), new Vehicle("Uno"),
                new Vehicle("Uno"), new Vehicle("Palio"));

        Stream<String> vehicleRepresentationStream = vehicleOperations.getRepresentation(vehicleStream);
        System.out.println("\n--------Stream of vehicles--------");
        vehicleRepresentationStream.forEach(System.out::println);


        Stream<Vehicle> vehicleStream2 = Stream.of(new Vehicle("Gol"), new Vehicle("Gol"), new Vehicle("Palio"), new Vehicle("Uno"), new Vehicle("Uno"), new Vehicle("Palio"));
        List<Vehicle> vehiclesList = vehicleOperations.getList(vehicleStream2);
        System.out.println("\n--------Vehicles List--------");
        vehiclesList.forEach(System.out::println);
    }
}
