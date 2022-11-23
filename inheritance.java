package com.company;


class Base{
    int x;
    public void printMe(){
        System.out.println("I am a constructor");
    }
    public void setX(int x){
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public int getX(){
        return x;
    }
}
class Derived extends Base{
    int y;
     public int getY(){
         return y;
     }
     public void setY(int y){
         this.y = y;
     }
}
public class inheritance {
    public static void main(String[] args){
        //CREATING AN OBJECT OF BASE CLASS
        Base b = new Base();
        b.setX(6);
        System.out.println(b.getX());

        //CREATING AN OBJECT OF DERIVED CLASS (DERIVED FROM BASE CLASS
        Derived d = new Derived();
        d.setX(8);
        System.out.println(d.getX());

    }
}
