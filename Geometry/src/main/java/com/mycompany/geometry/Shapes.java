package com.mycompany.geometry;

import java.util.Scanner;

public class Shapes extends Geometry {
     int base;
     int height = 19;
     int area;
     
     Scanner input = new Scanner(System.in);
     //          methods
     public void base() {
        System.out.println("Base of the shape here.");
//        base = input.nextInt();
     }
     public void height() {
        System.out.println("Height of the shape here.");
          
     }
     public void area() {
        System.out.println("Area of the shape here.\n");
      
     }
//   end methods
   
     public class Triangle extends Shapes {
//         methods
           public void intro() {
               System.out.append("Triangle\n");
           }
           public void base() {
                System.out.println("Base of the triangle is: ");
                base = input.nextInt();
            }
            public void height() {
                System.out.println("Height of the triangle is: " + height);
          
            }
            public void area() {
                area = (base * height)/ 2; 
                System.out.println("Area of the triangle is: " + area);   
            }
     }
     
      public void display() {
         Triangle dis = new Triangle();
         dis.intro();
         dis.base();
         dis.height();
         dis.area();
     }
     
}
