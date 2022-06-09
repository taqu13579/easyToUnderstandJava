package chapter5.record;

import chapter5.csv.Csv;

public record Population (String prefecture, int population, double rate) {
    public Population {
        if(prefecture == null) {
            throw new RuntimeException();
        }
    }

    public Population(String prefecture, int population) {
        this(prefecture, population, 0);
    }

    public boolean isPlus() {
        return rate > 0;
    }

    public static Population of(Csv csv) {
        return new Population(csv.get(0),
                csv.getInt(1),
                csv.getDouble(2));
    }
}