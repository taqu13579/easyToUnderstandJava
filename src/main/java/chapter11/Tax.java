package chapter11;

public class Tax {
    public static void main(String[] args) {
        TaxRate rate = new Tax01();
        double result = tax(100000, rate);
        System.out.println(result);
    }

    public static double tax(int shotoku, TaxRate t) {
        double r = t.rate(shotoku);
        return r * shotoku;
    }
}
