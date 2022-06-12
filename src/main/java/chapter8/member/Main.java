package chapter8.member;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Member member = new StudentMember(100, "田中", LocalDate.of(2004, 7, 30));
        System.out.println(member.getId());
        System.out.println(member.getName());

        if (member instanceof StudentMember s) {
            System.out.println(s.getBirtyDay());
        }
    }
}
