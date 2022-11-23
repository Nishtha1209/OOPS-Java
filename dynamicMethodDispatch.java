package com.company;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void On(){
        System.out.println("Turning ON Phone...");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void On(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class dynamicMethodDispatch {
    public static void main(String[] args){
//        Phone obj = new Phone();
//        obj.name();
//        SmartPhone smobj = new SmartPhone();
        Phone obj = new SmartPhone(); //yes it is allowed , Object is created during runtime
        obj.showTime();
        obj.On();
        //obj.music ..not allowed  //METHOD KONSA RUN HOGA RUNTIME PR DECIDE HOTA HAI KYUKI OBJECT RUNTIME ME BANTA HAI...DYNAMIC METHOD DISPATCH

//        SmartPhone obj2 = new Phone(); would throw an error
    }
}
