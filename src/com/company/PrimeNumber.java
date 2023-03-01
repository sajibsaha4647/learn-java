package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("enter a number :");

        number = input.nextInt();
        int count = 0;

        

        if(number == 0 || number == 1){
            System.out.println("not prime");
        }else{
            for(int i = 2; i<number;i++){
                if(number%i == 0){
                    count++;
                    break;
                }
        }
        if(count == 0 ){
            System.out.println("prime number");
        }else{
            System.out.println("not prime");
        }
        }

        
        

    }
}
