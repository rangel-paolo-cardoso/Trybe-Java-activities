package program;

import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {

        String item = "Test item";
        Stream<String> firstStream = StreamCreator.createFromItem(item);
        firstStream.forEach(System.out::println);

        String[] anArray = new String[] {"Dimitry"};
        Stream<String[]> secondStream = StreamCreator.createFromItem(anArray);
        secondStream.forEach(System.out::println);

        List<String> aList = List.of("Susan");
        Stream<List<String>> thirdStream = StreamCreator.createFromItem(aList);
        thirdStream.forEach(System.out::println);
    }
}
