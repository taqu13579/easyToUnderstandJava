package chapter20;

import java.util.Comparator;
import java.util.List;

public class Sample1 {
    public static void main(String[] args) {
        var pcList = PC.getList();

        System.out.println("-----filter-----");
        pcList.stream()
                .filter(pc -> "P".equals(pc.maker()))
                .forEach(System.out::println);
//        var newList = pcList.stream()
//                .filter(pc -> "P".equals(pc.maker()))
//                .toList();
//        newList.stream()
//                .forEach(System.out::println);

        System.out.println("-----map-----");
        pcList.stream()
                .map(pc -> pc.maker())
                .forEach(System.out::println);

        System.out.println("-----distinct-----");
        pcList.stream()
                .map(pc -> pc.maker())
                .distinct()
                .forEach(System.out::println);

        System.out.println("-----sorted-----");
        pcList.stream()
                .sorted(Comparator.comparing(PC::price))
                .forEach(System.out::println);

        System.out.println("-----skip-----");
        pcList.stream()
                .sorted(Comparator.comparing(PC::price))
                .skip(3)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-----flatMap-----");
        Department.getList().stream()
                .map(Department::employees)
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("-----mapMulti-----");
        Department.getList().stream()
                .<String>mapMulti( (dep, buffer) ->
                        dep.employees().forEach(name -> buffer.accept(name))
                )
                .forEach(n -> System.out.print(n + " "));
        System.out.println("");

        List.of(1, 2, 3, 4, 5).stream()
                .mapMulti( (n, buffer) -> {
                    buffer.accept(n);
                    buffer.accept(n);
                    buffer.accept(n);
                }).forEach(System.out::print);

        System.out.println("");
        System.out.println("-----dropWhile-----");
        List.of(9, 6, 5, 5, 2, 1, 8, 5, 4, 9).stream()
                .dropWhile(n -> n >= 5)
                .forEach(System.out::print);

        System.out.println("");
        System.out.println("-----takeWhile-----");
        List.of(9, 6, 5, 5, 2, 1, 8, 5, 4, 9).stream()
                .takeWhile(n -> n >= 5)
                .forEach(System.out::print);

        System.out.println("");
        System.out.println("-----peek-----");
        var priceList = pcList.stream()
                .map(PC::price)
                .peek(price->System.out.printf("%6d", price))
                .distinct()
                .toList();

        System.out.println("");
        priceList.forEach(p -> System.out.printf("%6d", p));
    }
}
