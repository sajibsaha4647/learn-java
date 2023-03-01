
package com.company;

import java.util.Scanner;

class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number ;
        System.out.println("enter a number");

        number = input.nextInt();

        int sum = 0;
        int r ;
        int temp = number;
        while(temp != 0){
            r = temp%10;
            sum = sum+r*r*r;
            temp = temp/10;
        }

        if(number == sum){
            System.out.println("armstrong number");
        }else{
            System.out.println("not armstrong number") ;
        }


    }
}