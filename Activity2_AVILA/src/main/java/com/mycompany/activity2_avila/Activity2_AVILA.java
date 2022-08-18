/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.activity2_avila;

/**
 *
 * @author christinejade
 */
import java.util.Scanner;

public class Activity2_AVILA {

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access Denied. You are not old enough");
        } else {
            System.out.println("Access Granted. You are old enough");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Age: ");
        int age = input.nextInt();
        
        checkAge(age);
    }
}
