package stream;

import java.util.Arrays;
import java.util.List;

class Stream{

    public static void main(String[] args) {
        List<String> aList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        aList
                .stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}