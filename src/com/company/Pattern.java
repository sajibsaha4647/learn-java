package com.company;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("enter a valid number");
        number = input.nextInt();

        for(int row = 1; row<=number;row++){
            for(int col = 1 ; col<=row;col++){
                System.out.print(row);
            }
            System.out.println(" ");
        }
    }
}
