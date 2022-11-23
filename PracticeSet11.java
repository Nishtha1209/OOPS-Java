package com.company;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen{
    void changeNib(){
        System.out.println("Change your pen's nib");
    }

    @Override
    void refill() {
        System.out.println("Refill your ink");
    }

    @Override
    void write() {
        System.out.println("Writing");
    }
}
class monkey{
    void jump(){
        System.out.println("Jumping...toing toing toingg...");
    }
    void bite(){
        System.out.println("Biting");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends monkey implements BasicAnimal{
    @Override
    public void eat() {
        System.out.println("eating");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }
}
public class PracticeSet11 {
    public static void main(String[] args) {
//QUESTION 1
//        FountainPen p1 = new FountainPen();
//        p1.refill();

        //QUESTION 3
//        Human h1 = new Human();
//        h1.eat();

        //QUESTION 5
        monkey m1 = new Human();
//        m1.sleep(); --wont work because referene is monkey which doees not use speak method
        BasicAnimal buntea= new Human();
        buntea.eat();
//        buntea.bite(); -- wont work
        }
}
