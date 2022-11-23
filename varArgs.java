package com.company;

public class varArgs {
//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
    static int sum(int x, int...arr){ //here x is the compulsory parameter
        int sum= x;
//        available as int []arr;
        for (int element: arr){
            sum = element+sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs tutorial");
        System.out.println("The sum of two given numbers is "+sum(45,80));
        System.out.println("The sum of three given numbers is "+ sum(23,56,79,99));
    }
}
