package com.mycompany.activity6_avila;

/**
 *
 * @author christinejade
 */
import java.util.Scanner;

public class Activity6_AVILA {

    public static void main(String[] args) {

        LogIn parent = new LogIn();
        parent.signIn();
        
        System.out.println("\nThank you for logging in.");
        System.out.println("This is your username "+ parent.getUsername());
        System.out.println("Remember your password "+ parent.getPassword());

    }
}

class LogIn {
    
    private String username;
    private String password;
    int total = 0;
        
    public void signIn(){
            
              
        for (int attempts = 0; attempts < 3; attempts++){

            Scanner input = new Scanner(System.in);

            System.out.print("Username: ");
            this.username = input.nextLine();

            System.out.print("Password: ");
            this.password = input.nextLine();             
                
            if (username.equals("admin123")&& password.equals("1234")){

                Info display = new Info();
                display.information();
                    
                break;
                 
            } else {

                total = 2 - attempts;
                System.out.println("\nYou have " + total + " remaining attempt/s left..");
                    
            }
               
        }
                
    }
        
    public String getUsername(){
        return username;
        
    }

    public String getPassword(){
            
        return password;
            
    }

    public void setUseraname(String newUsername){
            this.username=newUsername;
    }   

    public void setPassword(String newPassword){
            this.password=newPassword;
    }
}
    

        
        
    



