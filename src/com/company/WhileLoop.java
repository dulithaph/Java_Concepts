package com.company;

import java.util.Scanner;

public class WhileLoop {

    public void useWhile(){

        Scanner input = new Scanner(System.in);

        int num = 0;
        int sum = 0;

        while (num>=0){
            sum += num;
            System.out.print("Enter the number :");
            num = input.nextInt();
        }

        System.out.println("Sum :" + sum );
        System.out.println();

        int s =1;
        while(s<=5){
            System.out.println(s);
            s++;
        }

        //using do-while

        int num2 = 0;
        int sum2 = 0;

        do{
            sum2 += num2;
            System.out.print("Enter the numbers ::");
            num2 = input.nextInt();
        } while (num2>=0);

        System.out.println("Sum  ::" + sum2);
        System.out.println();
    }
}
