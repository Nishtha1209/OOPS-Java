package com.company;
import java.util.Scanner;

public class cbsePercentage {
   public static void main(String args[]){
       //for three subjects
       System.out.println();
       int maxMarks = 300;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter marks of subject 1: ");
       float subject1 = sc.nextFloat();
       System.out.println("Enter marks of subject 2: ");
       float subject2 = sc.nextFloat();
       System.out.println("Enter marks of subject 3: ");
       float subject3 = sc.nextFloat();
//total percentage
       float percent = (subject1+subject2+subject3)*100/maxMarks;
       System.out.println("The total percentage is: "+ percent);
   }

}
