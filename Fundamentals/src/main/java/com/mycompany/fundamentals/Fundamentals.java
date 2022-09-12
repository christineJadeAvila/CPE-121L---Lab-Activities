/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fundamentals;

/**
 *
 * @author admin
 */
public class Fundamentals {
    public static void main(String[] args) {
        FundamentalsOfProgramming display = new FundamentalsOfProgramming();
        display.fundamentals();
    }
}

class FundamentalsOfProgramming {
    String str = "Computer Engineer";
    String day;

    public void fundamentals() {

        // number 1
        System.out.println(str);

        // number 2
        day = "Monday";

        if (day.equals("Monday")) {
            System.out.println("Oh, no! Monday!");

        } else if (day.equals("Tuesday")) {
            System.out.println("Oh, no! Monday! #2");

        } else if (day.equals("Wednesday")) {
            System.out.println("Oh, no! Monday! #3");

        } else if (day.equals("Thursday")) {
            System.out.println("Oh, no! Monday! #4");

        } else if (day.equals("Friday")) {
            System.out.println("Thank God, for its Friday");

        }


        // number 3
        day = "Friday";

        switch(day) {
            case "Monday":
                System.out.println("Oh, no! Monday!");
                break;

            case "Tuesday":
                System.out.println("Oh, no! Monday! #2");
                break;

            case "Wednesday":
                System.out.println("Oh, no! Monday! #3");
                break;

            case "Thursday":
                System.out.println("Oh, no! Monday! #4");
                break;

            case "Friday":
                System.out.println("Thank God, for its Friday ");
                break;
        }

        // number 4

        for (int x = 3; x <= 20; ++x) {
            System.out.println(x);
        }
    }
}


