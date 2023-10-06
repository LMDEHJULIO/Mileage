package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class MileageScanner {
    Scanner scanner = new Scanner(System.in);
    //Map the prompt to the scanner input
    Map<PromptEnum, Supplier<Object>> prompts = new HashMap<>();

    public enum PromptEnum {
        QUANTITY("Enter the quantity: "),
        PRICE("Enter the price: "),
        DELIVERY_DISTANCE("Enter the delivery distance (miles): ");

        private String prompt;
//        https://www.w3schools.com/java/java_enums.asp
        PromptEnum(String prompt){
           this.prompt = prompt;
        }

        public String getPrompt() {
            return prompt;
        }

        public void setPrompt(String prompt) {
            this.prompt = prompt;
        }
    }

//    interface PromptMethod {
//        void execute();
//    }

    public MileageScanner() {
        prompts.put(PromptEnum.QUANTITY, () -> scanner.nextInt());
        prompts.put(PromptEnum.PRICE, () -> scanner.nextDouble());
        prompts.put(PromptEnum.DELIVERY_DISTANCE, () -> scanner.nextDouble());
    }

//    https://www.w3schools.blog/map-interface-in-java

    public Map<PromptEnum, Supplier<Object>> getPrompts() {
        return prompts;
    }

    public void setPrompts(Map<PromptEnum, Supplier<Object>> prompts) {
        this.prompts = prompts;
    }

    public Object promptUser(PromptEnum prompt){
        System.out.println(prompt.getPrompt());
        return prompts.get(prompt).get();
    }

    public void runSurvey(){
        this.promptUser(MileageScanner.PromptEnum.QUANTITY);
        this.promptUser(MileageScanner.PromptEnum.PRICE);
        this.promptUser(MileageScanner.PromptEnum.DELIVERY_DISTANCE);
    }
}
