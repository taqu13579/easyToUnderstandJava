package chapter20;

import java.util.List;

record PC(String name, String type, int price, String maker) implements Comparable<PC>{
    public static List<PC> getList() {
        return List.of(
                new PC("DELL-01", "NOTE", 50, "D"),
                new PC("HP-02", "DESKTOP", 120, "H"),
                new PC("Panasonic-01", "NOTE", 100, "P"),
                new PC("Panasonic-03", "NOTE", 100, "P"),
                new PC("TOSHIBA-05", "DESKTOP", 30, "T"),
                new PC("FUJITSU-03", "DESKTOP", 80, "F")
        );
    }

    @Override
    public int compareTo(PC o) {
        return 0;
    }
}

public class Sample1 {
    public static void main(String[] args) {
        var fruits = List.of("banana", "apple", "orange", "peach");
        fruits.stream().sorted().forEach(System.out::println);

        var pcList = PC.getList();
        pcList.stream()
                .filter(pc -> "P".equals(pc.maker()))
                .forEach(System.out::println);
    }
}
