package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i =0;
        while(i<15){
            System.out.println("I am a thread "+ this.getName());
            i++;
        }
    }
}
public class threadPriorities {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Nishtha");
        MyThr1 t2 = new MyThr1("bheem");
        MyThr1 t3 = new MyThr1("laddoo");
        MyThr1 t4 = new MyThr1("chocolate (most imp)");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
