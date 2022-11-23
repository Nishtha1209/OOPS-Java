package com.company;

/**
 * This is a class
 */
public class methodTags {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * Hello this is method
     * @param i This is the first number
     * @param j This is the second number
     * @return Sum of the two numbers as an integer
     * @throws Exception if i is zero
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i, int j) throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c = i+j;
        return c;
    }
}
