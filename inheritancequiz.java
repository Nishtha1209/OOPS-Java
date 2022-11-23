package com.company;

class animals{
    String sound;
    String food;
    int pitch;

    public void setSound(String sound){
        this.sound=sound;
    }
    public String getSound(){
        return sound;
    }
    public void movement(){
        System.out.println("It walks like mammals");
    }
}
class dog extends animals{
    public void animaltype(){
        System.out.println("I am a dog!");
    }
}
public class inheritancequiz {
    public static void main(String[] args) {
        animals a1 = new animals();
        a1.movement();
        a1.setSound("roar");
        System.out.println(a1.getSound());

        dog d1 = new dog();
        d1.movement();
        d1.animaltype();
    }
}
