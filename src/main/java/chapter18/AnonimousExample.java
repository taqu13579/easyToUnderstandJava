package chapter18;

interface Predicate {
    boolean test(int n);
}

public class AnonimousExample {
    public static void main(String[] args) {
        Predicate p = new Predicate() {
            @Override
            public boolean test(int n) {
                return n > 100;
            }
        };
        System.out.println(p.test(10));
    }
}
