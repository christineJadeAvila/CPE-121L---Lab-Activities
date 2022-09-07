/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.activity8_avila;
import static java.lang.Math.pow;
import java.util.Scanner;

class Menu {
     String sel;
     Scanner input = new Scanner(System.in);
     
     public void opt(){
         
         System.out.println("MENU");
         System.out.println(" [a] Check for odd or Even \n [b] Check for palindrome \n [c] Check for Armstrong \n");
         System.out.println("Enter a Letter: ");
         sel = input.next();
         checkSel(sel);
     }
     
     public void checkSel(String opt){
         
         if(opt.equals("a")){
           OddEven a = new OddEven();
           a.checkOddEven();
         }else if (opt.equals("b")){
           checkPal b = new checkPal();
           b.checkPalin();
         }else if (opt.equals("c")){
            Armstrong c = new Armstrong();
            c.checkArm();
         }
     }
     
}

    class OddEven extends Menu {
        
        private int x;
        
       public void checkOddEven(){
           //proccess for Checking odd or even
           System.out.println("Check for Odd Even");
           System.out.print("Enter a positive integer number: ");
           x=input.nextInt();
           
           if(x>=0){
               if (x%2==0){
                   System.out.println(x+ " is an Even Number");
               }
               else{
                   System.out.println(x+ " is an Odd number");
 
               }
                          
           }
           else{
               System.out.println("Invalid Input: Input a Positive integer value.");
           }
           
       }
    }


class checkPal extends Menu{
    
    int y , digit , reverse;
    
    public void checkPalin(){
      //proccess for the palindrome  
        System.out.println("Check for Palindrome");
        System.out.print("Enter a Positive integer number: ");
        y=input.nextInt();
        
        if (y>=0){
            for(int palindrome = y; palindrome!=0;){
                //789
                digit = palindrome % 10; //d=9 , d= 8 , 7  
                reverse = (reverse*10)+digit;//9 // 98 // 987
                palindrome = palindrome / 10;//78 , 7 , 0 
            }
        }else{
            System.out.println("Invalid Input: Input a Positive integer value.");
        }
        if (y==reverse){
            System.out.println(y+ " Is a palindrome");
        }else {
            System.out.println(y+ " Is not a Palindrome");
        }
    }
}

class Armstrong extends Menu{
    
    int z, digit, armstrong = 0, count;
    int num = z;
    public void checkArm(){
        // proccess for armstrong
        System.out.println("Check for Armstrong");
        System.out.print("Enter a Positive number: ");
        z=input.nextInt();
        
        while (num!=0){
             num /= 10;
            ++count;
        }
        
        if (z>=0){
           int arm=z;
           
           while(arm!=0){
               digit = arm % 10;
               armstrong = (int)(armstrong + pow(digit,count));
               arm = arm / 10;
               
           }
           
           if (z == armstrong){
               System.out.println(z+ " Is an armstrong number. " + count +" Digits.");
               
           } else {
               System.out.println(z+ " Is not an armstrong number");
           }
        } else {
            System.out.println("Invalid Input: Input a Positive integer value.");
        }
    }
}


public class Activity8_AVILA {

    public static void main(String[] args) {
        
        Menu display = new Menu();
        display.opt();
        
    }
    
}
