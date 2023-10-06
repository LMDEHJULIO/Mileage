package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FeeCalculator {
    private Map<PriceRange, Double> fees = new HashMap<>();

    public FeeCalculator(){
        fees.put(new PriceRange(0, 5), 2.0);
        fees.put(new PriceRange(6, 15), 5.0);
        fees.put(new PriceRange(16, 25), 2.0);
        fees.put(new PriceRange(26, 50), 2.0);
        fees.put(new PriceRange(0, 5), 2.0);
        fees.put(new PriceRange(51, 100000), 20.00);
    }
    //IntelliJ suggested Optional think abt why
    public Optional<Double> calcFee(double miles){

        return fees
               .entrySet()
               .stream()
               .filter(entry -> entry.getKey().withinRange(miles))
               .map(Map.Entry::getValue)
               .findFirst();

    }
}
