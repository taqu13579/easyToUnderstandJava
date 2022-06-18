package chapter21;

import javax.management.loading.PrivateClassLoader;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Sample1 {
    public static void main(String[] args) {
        var pcList = PC.getList();

        System.out.println("-----Match-----");
        if (pcList.stream().anyMatch(pc -> "HP-02".equals(pc.name()))) {
            System.out.println("HP-02あり");
        } else {
            System.out.println("HP-02なし");
        }

        System.out.println("-----find-----");
        Optional<String> anyPc = pcList.stream()
                .filter((pc -> "P".equals(pc.maker())))
                .map(PC::maker)
                .findAny();
        System.out.println(anyPc.orElseGet(() -> "P makterは存在しない"));

        System.out.println("-----reduce-----");
        Optional<String> pcNames = pcList.stream()
                .map(PC::name)
                .reduce((a, b) -> a + " " + b);

        System.out.println(pcNames.get());

        System.out.println("-----totalling-----");
        long count = pcList.stream().count();
        int sum = pcList.stream()
                .mapToInt(PC::price)
                .sum();
        OptionalDouble avg = pcList.stream()
                .mapToInt(PC::price)
                .average();
        OptionalInt max = pcList.stream()
                .mapToInt(PC::price)
                .max();
        OptionalInt min = pcList.stream()
                .mapToInt(PC::price)
                .min();

        System.out.println("件数：" + count);
        System.out.println("合計：" + sum);
        System.out.println("平均：" + avg.getAsDouble());
        System.out.println("最大：" + max.getAsInt());
        System.out.println("最小：" + min.getAsInt());

    }
}
