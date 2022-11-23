package com.company;

class MyEmployee{
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}
public class accessModifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
//        harry.id = 45;
//        harry.name = "cwh"; throws error due to private acces modifier
        harry.setName("codewithharry");
        System.out.println(harry.getName());
    }
}
