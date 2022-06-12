package chapter16;

import java.util.ArrayList;
import java.util.Comparator;

public class ListSorting {
    public static void main(String[] args) {
        var list = new ArrayList<Student>();

        list.add(new Student(103, "たなか"));
        list.add(new Student(101, "きむら"));
        list.add(new Student(102, "いのうえ"));

        list.sort(Comparator.comparing(Student::id));
//        list.sort(Comparator.comparing(Student::name));

        for (Student s: list) {
            System.out.println(s);
        }
    }
}
