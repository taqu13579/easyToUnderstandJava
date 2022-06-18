package chapter20;

import java.util.List;

public class fruitSample {
    public static void main(String[] args) {
        var fruits = List.of("banana", "apple", "orange", "peach");
        fruits.stream().sorted().forEach(System.out::println);
    }
}
