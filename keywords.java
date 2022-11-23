package com.company;

import java.security.interfaces.ECKey;

class EkClass{
    int a;

    public int getA() {
        return a;
    }

    EkClass(int v){
        this.a=v;  //this is a reference
    }
    public int returnone(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);  //used to refer immediate parent class object
        System.out.println("I am a constructor.");}
}
public class keywords {
    public static void main(String[] args){
        EkClass e = new EkClass(65);
        System.out.println(e.getA());
        DoClass d = new DoClass(5);
    }
}
