package chapter19;

import java.util.ArrayList;

record Student(int id, String name) {}

public class Sample2 {
    public static void main(String[] args) {
        var list = new ArrayList<Student>();
        list.add(new Student(101, "たなか"));
        list.add(new Student(102, "すずき"));
        list.add(new Student(103, "いとう"));
        list.forEach(System.out::println);
    }
}
