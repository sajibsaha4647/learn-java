package com.company;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("enter a valid number");
        number = input.nextInt();

        int sum = 0;
        int r ;
        int temp = number;
        while(temp!=0){
            r = temp%10;
            sum = sum*10+r;
            temp = temp/10;
        }
        if(number == sum){
            System.out.println("palindrom number");
        }else{
            System.out.println("Not a palindrom number");
        }
    }
}
