package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){// u cant use directly
        System.out.println("Good morning");
    }
    default void record4K(){
        greet();
        System.out.println("Recording in 4K..."); //isse aage oveerride kr sakte hai
    }
}
interface MyWifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class myCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
}
class MySmartPhone2 extends myCellPhone2 implements MyWifi2, MyCamera2 {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Taking video..");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting list of networks");
        String[] networkList = {"Nishtha", "Naveen"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }
}
public class polymorphism_interfaces {
    public static void main(String[] args) {
        MyCamera2 cam1 = new MySmartPhone2();
//        cam1.getNetworks(); --not allowed camera k functions chiye toh why use anything else aka restricts users
         cam1.record4K();
         MySmartPhone2 smp = new MySmartPhone2();
         smp.connectToNetwork("haha"); //sbkch chl jaega
        smp.callNumber(987654324); //CELLPHONE K METHODS BHI CHALENGE

    }
}

