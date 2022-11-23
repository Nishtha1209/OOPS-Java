package com.company;

import java.util.Scanner;

public class errors {
    public static void main(String[] args) {
//        int a = 6 //syntax error
//        System.out.println()
        //LOGICAL ERRORS-- JO CODE LIKHNE ME IDHR UDHR LOGIC GADBAD HOJATA HAI
        //RUNTIME ERROS-- SELF EXPLANATORY, EX: WHILE FETHING DATA ON A WEBSITE USING API

        //LOGICAL ERRORS
        //--WRITE A PROGRAM TO PRINT ALL PRIME NUMBERS BETWEEN 1 TO 10
//        System.out.println(2);
//        for(int i=1;i<5;i++){
//            System.out.println(2*i+1);   //9 bhi aaega output me which is not prime
//        }
        //RUNTIME ERROR
        int k;
        Scanner sc =new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}
