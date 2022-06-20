package chapter21;

import java.util.List;
import java.util.Optional;

public class OptionalSample {
    public static void main(String[] args) {
        Optional<Book> op1 = Optional.empty();
        Optional<Book> op2 = Optional.of(new Book("夏目漱石", "坊ちゃん"));
        Book book = null;
        Optional<Book> op3 = Optional.ofNullable(book);

        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);

        Optional<String> opt1 = Optional.of("value");
        Optional<String> opt2 = Optional.empty();
        System.out.println(opt1.or(() -> Optional.of("defalutValue")));
        System.out.println(opt2.or(() -> Optional.of("defalutValue")));

        Optional<String> optName = Optional.empty();
        String name1 = optName.orElse("田中");
        String name2 = optName.orElseGet(() -> "田中宏");
//        String name3 = optName.orElseThrow();
//        String name4 = optName.orElseThrow(() -> new RuntimeException("no value"));

        List<PC> pcList = PC.getList();
        Optional<PC> anyPc = pcList.stream()
                .filter(pc -> "G".equals(pc.maker()))
                .findAny();

        anyPc.ifPresentOrElse(
                pc -> System.out.println(pc.name()),
                () -> System.out.println("no value"));

        Optional<String> opt = Optional.of("abc");
        List<String> ls = opt.stream()
                .map(String::toUpperCase)
                .toList();

        ls.forEach(System.out::println);

        var list = List.of(Optional.of("abc"),
                Optional.empty(),
                Optional.of("def"));

        var charList = list.stream()
                .flatMap(Optional::stream)
                .toList();

        charList.forEach(System.out::print);
    }
}
