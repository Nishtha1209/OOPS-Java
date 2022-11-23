package com.company;

interface sampleInterface{
    void math1();
    void math2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void math4();
}
class MySampleClass implements childSampleInterface{
    @Override
    public void math1() {
        System.out.println("Meth 1");
    }

    @Override
    public void math2() {
        System.out.println("Meth 2");
    }

    @Override
    public void meth3() {
        System.out.println("Meth 3");
    }

    @Override
    public void math4() {
        System.out.println("Meth 4");
    }
}
public class inheritanceInterfaces{
    public static void main(String[] args) {
        MySampleClass sc = new MySampleClass();
        sc.meth3();
    }
}
