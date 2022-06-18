package chapter21;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

record Info(Set<String> names, Set<String> types) {}

public class Sample2 {
    public static void main(String[] args) {
        var pcList = PC.getList();

        System.out.println("-----typeGroup-----");
        var typeGroup = pcList.stream()
                .collect(groupingBy(PC::type, mapping(PC::name, toList())) );
        typeGroup.forEach((k, v) -> System.out.println("k: " + k + ", v:" + v));

        System.out.println("-----partitioning-----");
        var partitioningGroup = pcList.stream()
                .collect(partitioningBy(
                        pc -> pc.price() > 60, mapping(PC::name, toList())
                ));
        partitioningGroup.forEach((k, v) -> System.out.println("k: " + k + ", v:" + v));

        System.out.println("-----conversion-----");
        var mutable = pcList.stream()
                .map(PC::type)
                .collect(toList());

        var immutable = pcList.stream()
                .map(PC::type)
                .collect(toUnmodifiableList());

        mutable.stream().forEach(v -> System.out.print(v + " "));
        immutable.stream().forEach(v -> System.out.print(v + " "));
        System.out.println("");

        var set = pcList.stream()
                .map(PC::maker)
                .distinct()
                .peek(e -> System.out.printf("%10s", e))
                .collect(toCollection(TreeSet::new));
        System.out.println("");
        set.forEach(e -> System.out.printf("%10s", e));

        System.out.println("-----summarizing-----");
        var stat = pcList.stream()
                .collect(summarizingInt(PC::price));
        System.out.println("件数：" + stat.getCount());
        System.out.println("合計：" + stat.getSum());
        System.out.println("平均：" + stat.getAverage());
        System.out.println("最大：" + stat.getMax());
        System.out.println("最低：" + stat.getMin());

        System.out.println("-----teeing-----");

        Info info = pcList.stream()
                .collect(
                        teeing(
                                mapping(PC::name, toSet()),
                                mapping(PC::type, toSet()),
                                Info::new
                        )
                );

        System.out.println(info);

    }
}

