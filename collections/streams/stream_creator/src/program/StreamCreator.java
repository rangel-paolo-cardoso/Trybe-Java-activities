package program;

import java.util.List;
import java.util.stream.Stream;

public final class StreamCreator {
    
    public static <T> Stream<T> createFromItem(T item) {
        return Stream.of(item);
    }

    public static <T> Stream<T> createFromArray(T[] array) {
        return Stream.of(array);
    }

    public static <T> Stream<T> CreateFromList(List<T> aList) {
        return aList.stream();
    }
}
