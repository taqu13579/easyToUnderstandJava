package chapter24;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        var list = List.of(
                new SmrtPhone("100", Color.WHITE),
                new SmrtPhone("101", Color.BLACK),
                new SmrtPhone("102", Color.BLACK),
                new SmrtPhone("103", Color.GOLD)
        );

//        list.forEach(System.out::println);
        list.stream()
                .filter(s -> s.color() == Color.BLACK)
                .forEach(System.out::println);

        var values = Color.values();
        Arrays.stream(values)
                .forEach(System.out::println);

        var whiteColor = Color.WHITE;
        System.out.print(whiteColor.name() + " ");
        System.out.println(whiteColor.ordinal());

        System.out.println(Color.WHITE.getModelNumber());
        System.out.println(Color.BLACK.getModelNumber());
        System.out.println(Color.GOLD.getModelNumber());

    }
}
