
package com.mycompany.algorithmsz;

/**
 *
 * @author admin
 */

import java.util.Scanner;
import java.lang.Math;

public class Activity8 {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Palindrome display = new Palindrome();
        Armstrong display1 = new Armstrong();
        display1.checkArm();
        display.checkPalindrome();

    }
}

class Palindrome extends Activity8 {

    int num,
        digit, 
        reverse;
    
    public void checkPalindrome() {
        
        //input positive number 
        System.out.println("\nInput positive palindrome number");
        num = input.nextInt();
        
        if(num >= 0) {
            //check palindrome
            for (int palindrome = num; palindrome != 0;) {
            // perform operation here    
                digit = palindrome % 10;
                reverse = (reverse * 10) + digit;
                palindrome = palindrome / 10;
            }
        } else {
            System.out.println("\nPlease input positive palindrome number");
        } 
        
        //output if inputted number is a palindrome
        
        if (num == reverse) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}

class Armstrong extends Activity8 {

    public void checkArm() {
        int num, 
            originalNumber,
            remainder,
            result = 0,
            n = 0;

        System.out.println("\nPlease input a positive armstrong number: ");
        num = input.nextInt();

        originalNumber = num;

        //check if inputted number is an armstrong
        for (;originalNumber != 0; originalNumber /= 10, n++);

        originalNumber = num;

        for (;originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);

        }

        //output if inputted number is an armstrong

        if(result == num) {
            System.out.println(num + " is an armstrong number");
        } else {
            System.out.println(num + " is not an armstrong number");
        }

    }
}