/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exam2;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Exam2 {

    public static void main(String[] args) {

        Downpayment display = new Downpayment();
        Payments display1 = new Payments();
        
        display.checkDownPayment();
        display1.checkPayment();
    
        System.out.println("\nDeveloped by: Christine Jade V. Avila");
        System.out.println("License No: 532519");

    }
}

class Downpayment {

    double houseCost = 1050000;
    double downpaymentPercent = 0.15;

    double downPayment = houseCost * downpaymentPercent;
    double balance = houseCost - downPayment;

    public void checkDownPayment(){

        System.out.println("Down Payment: " + downPayment + " php");
        System.out.println("Balance to Pay: " + balance + " php");
        
    }
    
}

class Payments extends Downpayment {

    String numOfPayments;
    Scanner input = new Scanner(System.in);

    int numOfYears;
    double pay, interest, yearlyPayment, sum = 0;
    
    public void checkPayment() {

        System.out.println("\nNumber of Payments Available:");
        System.out.println("[a] 5 Years \n[b] 10 Years \n[c] 20 Years \n[d] 30 Years");

        System.out.print("\nSelect number of Payments: ");
        numOfPayments = input.next();

        if (numOfPayments.equals("a")){

            numOfYears = 5;

        } else if (numOfPayments.equals("b")){

            numOfYears = 10;

        } else if (numOfPayments.equals("c")) {

            numOfYears = 20;

        } else if (numOfPayments.equals("d")) {

            numOfYears = 30;

        } else {
            System.out.println("Please input a, b, c, d");
        }

        pay = balance / numOfYears;
        interest = pay * 0.035; // 3.5 %
        yearlyPayment = pay + interest;
    
        for(int y = 1; y <= numOfYears; y++) { 

            sum = sum + yearlyPayment;

        } 

        double totalPayment = sum;
    
        System.out.println("\nTotal Payable for " + numOfYears + " years: " + totalPayment  );

        System.out.println("\nYearly Amortization ");

        System.out.println("Period");
        
        for(int x = 1; x <= numOfYears; x++) {

            System.out.println(x);

        }

        System.out.println("Yearly Amort. Balance: " + yearlyPayment);

    }
}

