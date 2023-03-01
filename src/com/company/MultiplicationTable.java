package com.company;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.println("enter a positive number :");
        number = input.nextInt();

        for(int i = 1; i<=number; i++){
            for(int j=i; j<=10;j++){
                System.out.println(i+"x"+j+"="+i*j);
            }
        }


    }
    
}
