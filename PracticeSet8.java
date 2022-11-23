package com.company;

class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class cellphone{
    public void ringing(){
        System.out.println("Ringing.....");
    }
    public void vibrating(){
        System.out.println("Vibrating");
    }
    public void callFriend(){
        System.out.println("Calling aatthu");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running away from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class PracticeSet8 {
    public static void main(String[] args) {
        //Problem 1
//        Employee harry = new Employee();
//        harry.salary=900000;
//        harry.setName("CodewithHarry");
//        System.out.println(harry.getSalary());
//        System.out.println(harry.getName());

        //Problem2
//        cellphone asus=  new cellphone();
//        asus.callFriend();
//        asus.ringing();
//        asus.vibrating();

        //problem 3
//        square sq = new square();
//        sq.side= 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

        //Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.hit();
        player1.run();
    }
}
