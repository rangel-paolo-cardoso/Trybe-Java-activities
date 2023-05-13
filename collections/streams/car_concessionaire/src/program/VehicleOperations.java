package program;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class VehicleOperations {
    
    <T> int numberOfDifferentVehiclesSold (Stream<T> vehiclesSold) {
        return (int) vehiclesSold.distinct().count();
    }

    <T> Stream<String> getRepresentation(Stream<T> vehicles) {
        return vehicles.map(t -> t.toString());
    }

    <T> List<T> getList(Stream<T> vehicles) {
        return vehicles.collect(Collectors.toList());
    }
}
