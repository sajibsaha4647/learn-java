package com.company;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("enter a number");
        number = input.nextInt();

        if(number > 0){
            System.out.println("positive number");
        }else if(number<0){
            System.out.println("negative number");
        }else{
            System.out.println("number is 0");
        }


        
    }
}
