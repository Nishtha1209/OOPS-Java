package com.company;

import jdk.swing.interop.SwingInterOpUtils;

class MyMainEmployee{
    private int id;
    private String name;
    private int salary;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    public MyMainEmployee(){ //constructor--invokes automatically
        id = 45;
        name = "Your name here";
    } //CONSTRUCTOR OVERLOADING IS ALSO POSSIBLE
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(int mySalary){
        int salary = 10000;

    }
}
public class constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("Programmingwithharry", 60);
        MyMainEmployee nish = new MyMainEmployee();
        System.out.println(nish.getId());
        System.out.println(nish.getName());
//        harry.setName("cwh");
//        harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
