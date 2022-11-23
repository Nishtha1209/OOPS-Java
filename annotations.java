package com.company;

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod();
//    void thisMethod2(); ---only 1
}
class NewPhone extends Phone{
    @Override
    public void showTime(){
        System.out.println("Time is 8pm");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class annotations {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(3,4);
    }
}
