package org.example;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class TotalDisplay {
//    Map<String, String> critera1 = new HashMap<String, String>();

    /*
        Should be in this format

                 ________________________________________________
			Product      Qty      Price       Miles      Total
			----         ---      -----      -----      -----
			Rice          20        5.0       10.0      105.0

					      Thank you. Come Again!!!
     */

    public void display(String name,double qty, double price, double miles, double total){
        System.out.printf("%33s", "------------------------------------------- \n");
//        System.out.printf("%33s ");
//        System.out.printf("%33s ");
//        System.out.printf("%33s ");

        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","Product", "Qty", "Price", "Miles", "Total");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","---", "---", "---", "---", "---");
        System.out.printf("%-15s%-15.2f%-15.2f%-15.2f%-15.2f\n", name, qty, price, miles, total);

        System.out.printf("%46s","Thank you. Come Again!!!");
    }


}
