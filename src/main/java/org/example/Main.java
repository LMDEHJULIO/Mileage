package org.example;

import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        MileageScanner mileageSurvey = new MileageScanner();

//        mileageSurvey.runSurvey();

        String name = (String) mileageSurvey.promptUser((MileageScanner.PromptEnum.NAME));
        int qty = (int) mileageSurvey.promptUser(MileageScanner.PromptEnum.QUANTITY);
        double price = (double) mileageSurvey.promptUser(MileageScanner.PromptEnum.PRICE);
        double distance = (double) mileageSurvey.promptUser(MileageScanner.PromptEnum.DELIVERY_DISTANCE);

        FeeCalculator feeCalculator = new FeeCalculator();

        Optional<Double> fee = feeCalculator.calcFee(distance);

        double total = (int) (price * qty) + fee.get();


        System.out.println(total);
        System.out.println(fee.orElse(0.0));
    }
}