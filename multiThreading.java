package com.company;

//method 1 to create a thread by extending class
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40){
            System.out.println("My cooking thread is running");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40){
            System.out.println("My thread 2 is good");
            System.out.println("I am sad");
            i++;
        }
    }
}
//BY IMPLEMENTING RUNNABLE INTERFACE
class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i =0;
        while(i<20){
            System.out.println("I am a thread 1 not threat 1");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<20){
            System.out.println("I am a thread 2 not threat 2");
            i++;
        }
    }
}
public class multiThreading {
    public static void main(String[] args) {
        //method 1
//        MyThread1 t1 = new MyThread1();
//        MyThread2 t2 = new MyThread2();
//        t1.start();
//        t2.start();
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
//        gun1.start();
//        gun2.start(); -- YOU CANNOT DIRECTLY RUN START METHOD HERE
        gun1.start();
        gun2.start();

    }
}
