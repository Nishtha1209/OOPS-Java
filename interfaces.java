package com.company;

//JAVA INTERFACE IS A GROUP OF RELATED METHODS WITH EMPTY BODIES
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int a =45;
    void blowHornK3g();
    void blowHornmhn();
}
//A CLASS CAN IMPLEMENT MULTIPLE INTERFACES BUT IT CANNOT EXTEND MULTIPLE ABSTRACT CLASSES
class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee pee poo poo");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUp");
    }

    @Override
    public void blowHornK3g() {
        System.out.println("Kabhi khushi kab hi gum");
    }

    @Override
    public void blowHornmhn() {
        System.out.println("Main hoon na");
    }
}
public class interfaces {
    public static void main(String[] args) {
        AvonCycle  cycleNishtha = new AvonCycle();
//        /you can create properties in interface
        cycleNishtha.applyBrake(3);
        //you cannot modify properties in interfaces as they are final
//        cycleNishtha.a = 55;
//        System.out.println(cycleNishtha.a);
        cycleNishtha.blowHornK3g();
        cycleNishtha.blowHornmhn();
    }
}
