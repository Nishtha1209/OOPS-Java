package com.company;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}
interface MyInt{
    void display();
}
public class advJavaPR2 {
    public static void main(String[] args) {
        //QUESTION 2
//        MyDeprecated d = new MyDeprecated();
//        d.meth1();

        //QUESTION 4
//        MyInt i = () -> System.out.println("I am display");

        //QUESTION 5
        int i = 5;
        String table = " ";
        for (int j = 0; j < 11; j++) {
            table += i + "X" + j + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
