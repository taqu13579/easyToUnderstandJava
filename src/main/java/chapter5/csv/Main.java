package chapter5.csv;

public class Main {
    public static void main(String[] args){
        Csv csv = new Csv("100,田中,20,68.0,178.5");
        String name = csv.get(1);
        int age = csv.getInt(2);
        double weight = csv.getDouble(3);
        double height = csv.getDouble(4);
        int n = csv.size();

        double bmi = weight / Math.pow(height / 100, 2);
        System.out.printf("%5s%6.1f", name, bmi);

    }
}
