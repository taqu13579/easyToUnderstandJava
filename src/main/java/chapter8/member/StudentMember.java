package chapter8.member;

import java.time.LocalDate;

public class StudentMember extends Member {
    private LocalDate birtyDay;

    public StudentMember(int id, String name, LocalDate birtyDay) {
        super(id, name);
        this.birtyDay = birtyDay;
    }

    public LocalDate getBirtyDay() {
        return birtyDay;
    }

    public void setBirtyDay(LocalDate birtyDay) {
        this.birtyDay = birtyDay;
    }

    public LocalDate expirationDate() {
        return birtyDay.plusYears(18);
    }
}
