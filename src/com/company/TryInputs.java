package com.company;

import java.util.Scanner;

public class TryInputs {

    public int number;

   public  void tryFilds(){

       Scanner input = new Scanner(System.in);

       System.out.print("Enter Age:");
       number = input.nextInt();



       System.out.print("Enter Name: ");
       String name = input.next();


       System.out.println("Your Name is : " + name);
       System.out.println("You entered : " + number);

   }

}
