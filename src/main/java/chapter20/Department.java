package chapter20;

import java.util.List;

public record Department(String name, String manager, List<String> employees) {
    public static List<Department> getList() {
        return List.of(
          new Department("総務", "田中", List.of("佐藤", "平山", "斉藤")),
          new Department("経理", "鈴木", List.of("向井", "山崎", "平木")),
          new Department("営業", "木村", List.of("真田", "堀山", "戸田"))
        );
    }
}
