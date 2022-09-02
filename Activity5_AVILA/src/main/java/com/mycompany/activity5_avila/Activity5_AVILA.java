package com.mycompany.activity5_avila;

import java.util.Scanner;

public class Activity5_AVILA {

    public static void main(String[] args) {
        Implement sub = new Implement();
        Implete sub2 = new Implete();
        sub.subtract();
        sub2.subtract2();
        
    }
}

abstract class AbstractClass{
    public abstract void subtract();
}

class Implement extends AbstractClass{
    //method
    public void subtract() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input 2 values: ");
        
        double x = input.nextDouble();
        double y = input.nextDouble();
        double diff = x - y;
        
        System.out.println("The difference is " + diff);
        
    }
    
}