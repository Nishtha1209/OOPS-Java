package com.company;

public class methodOverloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning "+ a + " bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int []arr){
        arr[0]=98;
    }
      static void tellJoke(){
        System.out.println("I invented a new word\n"+"Plagiarism");
    }
    public static void main(String[] args){
//       tellJoke();
        int []marks = {78,90,98,88,67};
        int []age = {4,5,6,7,8,9};
        //case 1: changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("X after running " + x);

        //Case 2 : Changing the array
//        change2(marks);
////        change2(age);
////        System.out.println(age[0]);
//        System.out.println("Array after running the change is "+marks[0]);

        //METHOD OVERLOADING-- DIFFERENT METHODS CAN HAVE SAME NAME BUT DIFFERENT PARAMETERS
        foo();
        foo(6); //ARGUMENT IS 6... THE VALUE WHICH IS GIVEN TO PARAMETER IS CALLED ARGUMENT--> ARGUMENTS ARE ACTUAL
    }
}
