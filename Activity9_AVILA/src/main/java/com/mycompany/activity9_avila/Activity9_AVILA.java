/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.activity9_avila;

/**
 *
 * @author BE214
 */
public class Activity9_AVILA {

    public static void main(String[] args) {
       Numbers num = new Numbers();
       num.list();
    }
    
}

class Numbers {
    
    public void list(){
         int list[] = { 1, 2, 3, 4, 5, 63, 532, 34, 35, 54, 34, 234, 54, 75, 21  };
         
         double sum = 0;
         double average;
         
         System.out.println("Using looping structure. These are the numbers stored in the list");
         for ( int x = 0; x < list.length; x++) {
             
             System.out.println(list[x]);
             sum = sum + list[x];
             
             
             
         } 
         
         average = sum / list.length;
         System.out.println("sum: "  + sum);
         System.out.println("average: " + average);
    }
   
}
