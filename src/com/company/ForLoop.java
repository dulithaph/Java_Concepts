package com.company;

import java.util.Scanner;

public class ForLoop {


    public void calSum(){

        Scanner input = new Scanner(System.in);


        System.out.print("Enter Number :");
        int n = input.nextInt();

        int sum = 0;

        for(int i = 0; i <= n; i++){

            sum += i;

        }

        System.out.println("Sum :" + sum);

    }

}
