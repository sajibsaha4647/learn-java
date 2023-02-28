package com.company;

import java.util.Scanner;

public class UppercaseLowerCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char chars;

        System.out.println("enter a char :");

        chars = input.next().charAt(0);

        if(Character.isUpperCase(chars)){
            System.out.println("uppercase");
        }else{
            System.out.println("lowercase");
        }


    }
    
}
