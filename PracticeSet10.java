package com.company;

class circle{
    int radius;
    circle(int radius){
        System.out.println("I am a circle paramaterized constructor");
        this.radius=radius;
    }
    public double area(){
       return Math.PI*radius*radius;
    }
    public double perimeter(){
         double perimeter = 2*Math.PI*radius;
         return perimeter;
    }
}
class cylinder1 extends circle{
    int height;
    cylinder1(int radius, int height){
        super(radius);
        System.out.println("I am a derived cylinder class");
    }
    public double area(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }
}
public class PracticeSet10 {
    public static void main(String[] args){
        //QUESTION 1
        circle c = new circle(4);
//        c.radius = 4;
        System.out.println("The area of circle is "+c.area());
        System.out.println("The perimeter of circle is "+c.perimeter());
        cylinder1 cy = new cylinder1(2,4);
//        cy.radius=2;
//        cy.height=4;
        System.out.println("Area of cylinder "+ cy.area());
    }
}
