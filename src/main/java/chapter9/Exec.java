package chapter9;

public class Exec {
    public static void main(String[] args) {
        Foo foo = new Bar();
        foo.show();
    }
}

class Foo {
    public void show() {
        System.out.println("Fooクラスです。");
    }
}

class Bar extends Foo {
    @Override
    public void show() {
        System.out.println("Barクラスです。");
    }
}

