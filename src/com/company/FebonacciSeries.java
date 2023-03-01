package com.company;

import java.util.Scanner;

public class FebonacciSeries {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("enter number");
        n = input.nextInt();
        int first = 0;
        int second = 1;
        int fibo;
        System.out.println(first+""+second);
        for(int i = 3; i<=n;i++){
            fibo = first+second;
            System.out.println(fibo);
            first = second;
            second = fibo;
        }

        
    }
    
}
