package org.example;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class FeeDisplay {
   static String critera1 = "0 - 5";
   static String critera2 = "6 - 15";
   static String critera3 = "16 - 25";
   static String critera4 = "26 - 50";
   static String criteria5 = "More than 5";

    static int fee1 = 2;
    static int fee2 = 5;
    static int fee3 = 10;
    static int fee4 = 15;
    static int fee5 = 20;

    // need to input params backwards for the formatting - weird but works for now
    //    https://stackoverflow.com/questions/19961671/java-creating-blank-spaces-with-printf

    // Should be in this format
    //        Distance 	    = Fee
    //        0 -  5 miles  = $2
    //        6 - 15 miles  = $5
    //        16 - 25 miles = $10
    //        26 - 50	miles = $15
    //        More than 50 miles = $20

    public static void display(){
        System.out.printf("%20s = Fee\n", "Distance");
        System.out.printf("%23s" + " = $" + fee1 + "\n", critera1 + " miles ");
        System.out.printf("%23s" + " = $" + fee2 + "\n", critera2 + " miles ");
        System.out.printf("%23s" + " = $" + fee3 + "\n", critera3 + " miles ");
        System.out.printf("%23s" + " = $" + fee4 + "\n", critera4 + " miles ");
        System.out.printf("%23s" + " = $" + fee5 + "\n", criteria5 + " miles ");

    }

    public static void main(String[] args) {
        FeeDisplay.display();
    }
}
