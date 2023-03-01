package com.company;

import java.util.Scanner;

public class PrimeNumberMtoN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int initialnum;
        System.out.println("enter initial number");
        initialnum = input.nextInt();

        int endingnumber;
        System.out.println("enter ending number");
        endingnumber = input.nextInt();
        int count = 0;

        if(initialnum <= 0 && endingnumber <= 0 || initialnum <= 1 && endingnumber <= 1){
            System.out.println("not prime");
        }else{
            for(int i = initialnum; i<=endingnumber;i++){
                if(i == 0 || i == 1 || i == 2){
                    continue;
                }else{
                    for(int j = 2; j<=i-1;j++){
                        if(i%j == 0){
                            count++;
                            break;
                        }
                    }
                }
                
                if(count == 0){
                    System.out.println("prime number"+i);
                }
                count = 0;
            }

            
        }

        

        
    }
    
}
