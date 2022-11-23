package com.company;

public class recursion {
    static int factorial(int n){
        //factorial(n) = n*n-1*....
        //factorial = n*factorial(n-1)
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    static int factorial_iterative(int n){
        if (n==0 ||n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1; i<=n; i++) { //1 to n
                product*=i;
        }
            return product;
        }
    }
    public static void main(String[] args) {
        System.out.println("The value of factorial 5 is " + factorial(5));
        System.out.println("The factorial using iterative approach is " + factorial_iterative(4));
    }
}
