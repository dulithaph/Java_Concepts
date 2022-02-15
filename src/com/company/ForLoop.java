package com.company;

import java.util.Scanner;

public class ForLoop {


    public void calSum(){

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int sum2 = 0;

        //find the sum of numbers
        System.out.print("Enter Number :");
        int n = input.nextInt();

        for(int i = 0; i <= n; i++){

            sum += i;

        }

        System.out.println("Factorial of " +n+ " is :" + sum);
        System.out.println();



        //find the sum of numbers using reverse
        System.out.print("Enter another number :");
        int b = input.nextInt();

        for(int a=b; a>=0; a--){
            sum2 += a;

        }

        System.out.println("Factorial of " +b+ " is :" + sum2);
        System.out.println();



        //for each loop - print sum of the elements

        int numbers[] = {2,4,6,8,10};
        int sum3 = 0;

        for(int arrayElement : numbers){

            sum3 += arrayElement;
        }

        System.out.println("Sum of for-each loop :" + sum3);
        System.out.println();

    }

}
