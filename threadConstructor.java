package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<5){
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class threadConstructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Nishtha");
        MyThr t2 = new MyThr("bheem");
        t1.start();
        t2.start();
        System.out.println("The id of the thread is "+ t1.getId());
        System.out.println("The name of thread is "+ t1.getName());
        System.out.println("The id of the thread is "+ t2.getId());
        System.out.println("The name of thread is "+ t2.getName());
    }
}
