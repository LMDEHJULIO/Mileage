package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class MileageScanner {
    Scanner scanner = new Scanner(System.in);
    //Map the prompt to the scanner input
    Map<String, PromptMethod> prompts = new HashMap<>();

    interface PromptMethod {
        void execute();
    }

    public MileageScanner() {
        prompts.put("Enter the product name: ", () -> scanner.nextLine());
        prompts.put("Enter the quantity: ", () -> scanner.nextInt());
        prompts.put("Enter the price per item: ", () -> scanner.nextDouble());
        prompts.put("Enter the delivery distance (miles): ", () -> scanner.nextDouble());
    }

//    https://www.w3schools.blog/map-interface-in-java

    public Map<String, PromptMethod> getPrompts() {
        return prompts;
    }

    public void setPrompts(Map<String, Supplier<Object>> prompts) {
        this.prompts = prompts;
    }

    public Object promptUser(String prompt){
        return prompts.get(prompt).get();
    }
}
