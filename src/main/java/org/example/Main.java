package org.example;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MileageScanner mileageSurvey = new MileageScanner();

        mileageSurvey.promptUser(mileageSurvey.prompts.get(1));
    }
}