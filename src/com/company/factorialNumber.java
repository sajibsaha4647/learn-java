package com.company;

import java.util.Scanner;

public class factorialNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int anysum,fact=1;
        System.out.println("enter a positive int number :");
        anysum = input.nextInt();

        for(int i = anysum; i>=1;i--){
            // fact = fact* i;
            System.out.println("print val "+i);
        }

        




        
    }
}
