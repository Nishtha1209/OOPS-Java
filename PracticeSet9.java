package com.company;

class cylinder{
    //problem 1
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(int radius, int height){
        return 2* Math.PI*height + 2* Math.PI*radius*radius;
    }
    public double volume(int radius, int height){
        return Math.PI*radius*radius*height;
    }

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
}
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length=4;
        this.breadth=5;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;

    }
}
public class PracticeSet9 {
    public static void main(String[] args) {
        /* PROBLEM 1
        cylinder c1 = new cylinder();
        c1.setHeight(12);
        c1.setRadius(4);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius()); */

        //PROBLEM 2
//        cylinder c2 = new cylinder();
//
//        System.out.println(c2.surfaceArea(3,4));
//        System.out.println(c2.volume(3,4));

        //PROBLEM 3
//        cylinder c3 = new cylinder(3,4);

        //PROBLEM 4
        Rectangle r1 = new Rectangle(12,56);
        System.out.println(r1.getBreadth());
        System.out.println(r1.getLength());
    }
}
