package com.company;

public class PracticeSet7 {
    static void pattern1_rec(int n){
        if (n>0){
            pattern1_rec(n-1);
            for (int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int average(int...arr){
        int sum = 0;
        for (int element:arr){
            sum+=element;
        }
        return sum/ arr.length;
    }
    static int fib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;

        //}
        if (n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    static void pattern2(int n){
        for (int i=n; i>0;i--){
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //summing up recursively
    static int sumRec(int n){
        //base condition for recursion
        if(n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }
    static int sum(int n){
        int result=0;
        result = (n*(n+1))/2;
        return result;
    }
    static void pattern1(int n){
        for (int i=1; i<=n; i++){
            for (int j=0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void table(int n){

        for (int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
    }

    public static void main(String[] args) {
        //problem 1
        //table(7);

        //problem 2
        //pattern1(9);

        //problem 3
        //System.out.println(sum(6));
//        int c =sumRec(5);
//        System.out.println(c);

        //problem 4
        //pattern2(4);

        //problem 5
//        int result = fib(5);
//        System.out.println(result);

        //problem 6
        System.out.println("The average of given numbers is "+ average(3,4,5,6,7));

        //problem 8
        pattern1_rec(4);
    }
}
