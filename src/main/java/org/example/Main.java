package org.example;

import java.util.Map;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        MileageScanner mileageSurvey = new MileageScanner();

//        mileageSurvey.runSurvey();

        int qty = (int) mileageSurvey.promptUser(MileageScanner.PromptEnum.QUANTITY);
        double price = (double) mileageSurvey.promptUser(MileageScanner.PromptEnum.PRICE);
        double distance = (double) mileageSurvey.promptUser(MileageScanner.PromptEnum.DELIVERY_DISTANCE);

        FeeCalculator feeCalculator = new FeeCalculator();

        Optional<Double> fee = feeCalculator.calcFee(distance);


        System.out.println(fee);
    }
}