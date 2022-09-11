package com.mycompany.arraysz;

import java.util.Scanner;

public class Activity10 {

    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Numbers display = new Numbers();
        Names display1 = new Names();
        display.list();
        display1.listOfNames();

    }
}

class Numbers extends Activity10 {

    public void list() {

        int list[] = {1, 2, 3, 4, 5, 6, 7};

        double sum = 0, 
               average;

        for (int x = 0; x < list.length; x++ ) {
            System.out.println(list[x]);

            //compute sum
            sum = sum + list[x];
        }

        //compute average
        average = sum / list.length;
        System.out.println(sum + " sum");
        System.out.println(average + " average");
    }

}

class Names extends Activity10 {

    public void listOfNames() {
        String names[] = new String[10];

        System.out.println("\nPlease input names: ");

        for (int x = 0; x < names.length; ) {

                names[x] = input.next();
                int n = x;

                if (names[x].equals("0")) {

                    System.out.println("\nList of inputted names:");
                    
                    for(int y = 0; y < n; y++) {

                        System.out.println(names[y]);
                    }

                } else if (n == names.length) {
                    System.out.println("\nList of inputted names:");
                    
                    for(int y = 0; y < names.length; y++) {

                        System.out.println(names[y]);
                    }
                    
                } else {
                    x++;
                }

                
            
        }
    }

}