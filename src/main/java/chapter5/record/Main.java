package chapter5.record;

public class Main {
    public static void main(String[] args) {
        Population[] data = {
                new Population("北海道", 5250, -6.8),
                new Population("東京都", 13921, 7.1),
                new Population("北海道", 8809, -0.4)
        };
        for (Population p : data) {
            System.out.printf("%s\t%,7d%7.1f%n",
                    p.prefecture(), p.population(), p.rate());
        }
    }
}
