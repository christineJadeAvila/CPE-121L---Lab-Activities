/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.activity10_avila;

/**
 *
 * @author BE214
 */
import java.util.Scanner;
public class Activity10_AVILA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String names[] = new String[10];
        
        System.out.println("Please input any names as many as possible");
        
        for ( int x = 0; x < names.length;) {
            names[x] = input.next();
            int count = x;
            
            if(names[x].equals("0")) {
                System.out.println("Display inputted names");
        
                for ( int y = 0; y < count; y++) {
                    System.out.println(names[y]);
                    
                }
           
            } else {
                
                x++;
                
            }
        }
        
//        System.out.println("Display inputted names");
//        
//        for ( int x = 0; x < names.length; x++) {
//            System.out.println(names[x]);
//            
//        }
        
    }
}
