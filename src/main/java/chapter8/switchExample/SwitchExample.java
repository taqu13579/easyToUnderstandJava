package chapter8.switchExample;

import java.awt.event.ActionEvent;

public class SwitchExample {
    public static void main(String[] args) {
        Object obj = new B();

        String result = switch(obj) {
            case C c -> c.name();
            case B b -> b.name();
            case A a -> a.name();
            case null -> "nullです。";
            default -> "その他クラス";
        };
        System.out.println(result);
    }
}

class A {
    public String name(){
        return "Aクラス";
    }
}

class B extends A {
    public String name(){
        return "Bクラス";
    }
    public int number() {
        return 100;
    }
}

class C extends A {
    public String name(){
        return "Cクラス";
    }
}
