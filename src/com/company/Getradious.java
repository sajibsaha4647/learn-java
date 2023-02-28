package com.company;

import java.util.Scanner;

public class Getradious {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radious ;

        System.out.println("please enter radious number :");

        radious = input.nextDouble();

       double radiousres = 3.1416*radious*radious;

        System.out.println(radiousres);


    }
    
}
