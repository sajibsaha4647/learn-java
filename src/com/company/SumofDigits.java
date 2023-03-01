package com.company;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("enter a valid number");
        number = input.nextInt();
        int sum = 0;
        int temp = number;
        System.out.println(number/10);
        while(temp!=0){
            int r = temp % 10;
            sum = sum + r;
            temp = temp / 10;
        }
        System.out.println(sum);




    }
    
}
