package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // testclass obj = new testclass();
        // System.out.println(obj.name);
        // System.out.println("\"sajib saha \r sajib \"");
        // Scanner input = new Scanner(System.in);
        // int number ;
        // System.out.println("enter a number");
        // number = input.nextInt();
        // System.out.println("the number is "+ number);
        AreaofTraingle areaofTraingle = new AreaofTraingle();

        Scanner input = new Scanner(System.in);
        double base,height;

        System.out.println("enter a number :");
        base = input.nextDouble();

        System.out.println("enter another number :");
        height = input.nextDouble();

        System.out.println(areaofTraingle.getvaluefromuser(base, height));




        
    }
}                                               
