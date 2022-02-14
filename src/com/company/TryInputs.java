package com.company;

import java.util.Scanner;

public class TryInputs {

    public int age;

   public  void tryFilds(){

       Scanner input = new Scanner(System.in);

       System.out.print("Enter Age:");
       age = input.nextInt();



       System.out.print("Enter Name: ");
       String name = input.next();


       System.out.println("Hi " + name + "  Your Age is " + age + " Therefore");

   }

}
