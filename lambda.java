package com.company;

@FunctionalInterface
interface DemoAno{
    void meth1(int a);
//    void meth2();
}
//class HarryFunc implements DemoAno{
//    @Override
//    public void meth1(){
//        System.out.println("Meth1");
//    }
//}
//class annonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("I am meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("I am meth2");
//    }
//}
public class lambda {
    public static void main(String[] args) {
//        DemoAno obj = new annonyDemo();
//        obj.meth1();

        //ANONYMOUS CLASS
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();

        //LAMBDA EXPRESSIONS
//        DemoAno obj = new HarryFunc();
//        obj.meth1();
        DemoAno obj = (a)->{System.out.println("I am method 1 from this lambda "+a);};
        obj.meth1(6);
    }
}
