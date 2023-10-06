package org.example;

public class PriceRange {
    private int min;
    private int max;

    public PriceRange(int min, int max){
        this.min = min;
        this.max = max;
    }

    public boolean withinRange(int miles) {
        return miles >= min && miles <= max;
    }
}
