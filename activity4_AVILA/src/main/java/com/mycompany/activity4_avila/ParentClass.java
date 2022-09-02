/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity4_avila;

/**
 *
 * @author christinejade
 */
import java.util.Scanner;

public class ParentClass {
    public static String name;
    
    public void call(){
        Scanner input = new Scanner(System.in);
        
        System.out.append("What is your name: ");
        
        name = input.nextLine();
        System.out.println("Who do you want to call, " + name + "?");
        System.out.println("[1] Eldest Child \n[2] Middle Child \n[3] Youngest Child");
        
        int select = input.nextInt();
//        switch(select){
//            
//        }
        if (select == 1) {
            Eldest inherit = new Eldest();
            inherit.talk();
        } else if (select == 2) {
            Middle inherit = new Middle();
            inherit.talk();
        } else if (select == 3) {
            Youngest inherit = new Youngest();
            inherit.talk();
        }  else {
            System.out.println("Invalid input. Input 1-4 only");
            call();
        }
        
        
        
    }
}
