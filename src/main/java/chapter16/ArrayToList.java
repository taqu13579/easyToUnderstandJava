package chapter16;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "cherry"};

        var list1 = Arrays.asList(array);
        var list2 = List.of(array);

        array[0] = "pinappel";

        printList(list1);
        printList(list2);

    }

    static void printList(List<String> list) {
        for (String str: list) {
            System.out.printf("%10s", str);
        }
        System.out.println();
    }
}
