package com.company;
import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args) {
//        int a = 10;
//        if (a == 11) {
//            System.out.println("I am 11");
//        }
//        else {
//            System.out.println("I am not 11");
//        }\
        //QUESTION 2
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter marks of subject 1: ");
//        int subject1 = sc.nextInt();
//        System.out.println("Enter marks of subject 2: ");
//        int subject2 = sc.nextInt();
//        System.out.println("Enter marks of subject 3: ");
//        int subject3 = sc.nextInt();
//        int total_percentage = (subject1+subject2+subject3)*100/300;
//
//        if(total_percentage>40){
//            if(subject1>33 && subject2>33 && subject3>33){
//                System.out.println("Hurray! You Passed.");
//            }
//            else{
//                System.out.println("Fail hogye nalayak");
//            }
//        }
//        else{
//            System.out.println("Thoda aur padhlete toh mummy ki maar se bach jate! SED.");
//        }

        //Question 3
//        System.out.println("Enter your income: ");
//        double income = sc.nextDouble();
//        double tax1= (income*5)/100;
//        double tax2 = (income*20)/100;
//        double tax3 = (income*30)/100;
//
//        if(income<250000 && income>500000){
//            System.out.println("The tax amount is: " + tax1);
//        }
//        else if(income<1000000 && income>500000){
//            System.out.println("The tax amount is: "+ tax2);
//        }
//        else if(income>100000){
//            System.out.println("The tax amount is: "+ tax3);
//        }
//        else{
//            System.out.println("No tax");
//        }

        //QUESTION 4
//        System.out.println("Enter the number between 1-7: ");
//        int number = sc.nextInt();
//        switch (number) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //QUESTION 5
//        System.out.println("Enter a year: ");
//
//        int year = sc.nextInt();
//        if(year%4 ==0 || year%400 ==0){
//            System.out.println("Leap year");
//        }
//        else{
//            System.out.println("Not a leap year.");
//        }

        //QUESTION 6
        System.out.println("Enter the url: ");
        String url = sc.nextLine();

        if(url.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if (url.endsWith(".org")){
            System.out.println("Organization Website");
        }
        else if (url.endsWith(".in")){
            System.out.println("Indian Website");
        }
    }
}
