package com.company;

abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor of Base2");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child2 extends Parent2{
    public void greet(){
        System.out.println("Good morning!");
    }
}
abstract class child3 extends Parent2{
    public void th(){
        System.out.println("I am good"); // ABSTRACT CLASS EK AISI CLASS HAI USING WHICH OTHER CLASSES CAN  BE MADE-- AKA ABSTRACT CLASS IS AN STANDARD CLASS
    }
}
public class abstractClass {
    public static void main(String[] args){
//        Parent2 P = new Parent2(); -- you cant do this
        child2 ch = new child2(); //yes this is possible
    }
}
//abstract class can only contain abstract methods.
