package com.company;

import java.util.Scanner;

class Temperature {

    public static void main(String[] args) {

        //censious to farenheit
        Scanner input  = new Scanner(System.in);
        double c ;

        System.out.println("Enter a number :");
        c = input.nextInt();

        // double result = 9/5*c+32;

        // System.out.println("censious to farenheit"+result);

        //farenheit to censious 

        double results = 1.8*(c-32);

        System.out.println("farenheit to censious"+results);


    }
    
}