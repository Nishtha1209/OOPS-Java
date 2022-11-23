package com.company;
import java.util.Scanner;

public class conditionals {
    public static void main(String[] args){
//        int age = 26;
//        if(age>18){
//            System.out.println("Yes you can drive. yipeeeeeee");
//        }
//        else{
//            System.out.println("You cannot drive.. sed...");
//        }
//        boolean a = true;
//        boolean b = true;
//        boolean c = true;
//        if (a&&b&&c){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }
//// ||logical or and logical NOT !(varialbe)
//        System.out.println(!a);
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        switch (age) {
            //enhNCED SWITCH WITHOUT BREAK STATEMENT
            case 18 -> System.out.println("You are going to become an adult");
            case 23 -> System.out.println("You are going to join a job.");
            case 68 -> System.out.println("You are going to retired");
            default -> System.out.println("Enjoy your life!");
        }
        System.out.println("thanks for using my java code");
        //agar break statement nahi lagaya toh saare cases execute hojaenge given condition k baad wale bhii
    }
}
