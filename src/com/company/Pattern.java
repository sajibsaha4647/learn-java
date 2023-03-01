package com.company;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("enter a valid number");
        number = input.nextInt();

//Top to bottom right angle
// 1 
// 12 
// 123 
// 1234 
// 12345 
        for(int row = 1; row<=number;row++){
            for(int col = 1 ; col<=row;col++){
                System.out.print(col);
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        for(int row = number;row >=1;row--){
            for(int col = 1; col<=row;col++){
                System.out.print(col);
            }
            System.out.println(" ");
        }


    }
}
