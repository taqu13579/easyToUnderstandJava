package chapter11;

public class Tax01 implements TaxRate {
    @Override
    public double rate(int gaku){
        return gaku < 100 ? 0.15 : 0.35;
    }
}
