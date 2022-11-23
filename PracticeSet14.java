package com.company;

import java.util.Scanner;

public class PracticeSet14 {
    public static void main(String[] args) {
        //PROBLEM 3
//        try{
//            int a = 666/0;
//        }
//        catch(ArithmeticException e){
//            System.out.println("Haha");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("HeHe");
//        }

        //PROBLEM 4
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is "+ marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>5){
            System.out.println("Error");
        }
    }
}
