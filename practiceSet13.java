package com.company;

import jdk.swing.interop.SwingInterOpUtils;

class gm extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<20){
            System.out.println("Good Morning!");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }

    }
}
class welcome extends Thread{
    @Override
    public void run() {
        int i=0;
        while(i<20){
            System.out.println("Welcome!");
            i++;
        }
    }
}
public class practiceSet13 {
    public static void main(String[] args) {
        gm g1 = new gm();
        welcome w1 = new welcome();
        g1.start();
        w1.start();
        g1.setPriority(9);
        System.out.println("the priority of w1 is "+w1.getPriority());
        System.out.println("the state of g1 is "+ g1.getState());
        System.out.println("the state of w1 is "+ w1.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
