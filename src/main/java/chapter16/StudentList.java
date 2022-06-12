package chapter16;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        var list = new ArrayList<Student>();
        list.add(new Student(101, "田中"));
        list.add(new Student(102, "鈴木"));
        list.add(new Student(103, "木村"));

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
