package com.company;

import jdk.swing.interop.SwingInterOpUtils;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int a){
        System.out.println("I am an overloaded constructor with value of a as: "+a);
    }
}
class derived1 extends Base1{
//AGAR DERIVED CLASS KA KHUD KA CONSTRUCTOR NAHI HAI TOH VO BASE CLASS SE INHERIT KRLEGA
    derived1(){
//        super(0); // base class ka argument wala constructor k liy use super keyword
        System.out.println("I am a derived constructor");
        //AUR AGR DERIVED CLASS KA BHI CONSTRUCTOR HAI TOH VOBHI RUN HOGA BASE CONSTRUCTOR K SAATH LEKIN PELHE BASE CLASS KA CONSTRUCTOR RUN HOGA
        }
    derived1(int a, int b){
        super(a);
        System.out.println("I am an overloaded constructor of derived with the value of b as: "+b);
    }
}

class ChildOfDerived extends derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int a, int b, int c){
        super(a,b);
        System.out.println("I am an overloaded constructor of derived with values of c as: "+c);
    }

}
public class constructors_in_inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        derived1 d = new derived1(14,9);
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(4,5,6);

    }
}
