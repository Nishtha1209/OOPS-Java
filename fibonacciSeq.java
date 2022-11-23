package com.company;

public class fibonacciSeq {

    //USING RECURSION
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }

        public static void main(String[] args) {
        //USING ITERATIVE APPROACH
            int n = 10, firstTerm = 0, secondTerm = 1;
            System.out.println("Fibonacci Series till " + n + " terms:");

            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + ", ");

                // compute the next term
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
}

