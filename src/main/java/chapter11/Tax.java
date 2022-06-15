package chapter11;

public class Tax {
    public static void main(String[] args) {
        TaxRate rate = new Tax01();
        double result = tax(100000, a -> a < 100 ? 0.15 : 0.35);
        System.out.println(result);
    }

    public static double tax(int shotoku, TaxRate t) {
        double r = t.rate(shotoku);
        return r * shotoku;
    }
}
