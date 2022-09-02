/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.geometry1;

/**
 *
 * @author christinejade
 */
import java.util.Scanner;
public class Geometry1 {

    public static void main(String[] args) {
        System.out.println("Name: Christine Jade V. Avila \nID Number: 532519\n");
        
        Shapes display1 = new Shapes();
        Triangle display2 = new Triangle();
        
        display1.base();
        display1.height();
        display1.area();
        
        display2.intro();
        display2.base();
        display2.height();
        display2.area();

    }
}

class Shapes extends Geometry1 {
    
    public void base() {
       System.out.println("Base of the shape here");
    }
    public void height() {
        System.out.println("Height of the shape here");
    }
    public void area() {
        System.out.println("Area of the shapes here");

    }   
}

class Triangle extends Shapes {
    int base;
    int height = 19;
    int area;
    
    Scanner input = new Scanner(System.in);
    public void intro() {
        System.out.println("\nTriangle");
    }
    
    public void base() {
       System.out.print("Base of the triangle is: " );
       base = input.nextInt();
    }
    public void height() {
       System.out.println("Height of the triangle is: " + height);
    }
    public void area() {
       area = (base * height) / 2; 
       System.out.println("Area of the triangle is "+ area);
    }
}
