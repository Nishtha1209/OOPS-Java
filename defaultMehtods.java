package com.company;

interface MyCamera{
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
interface MyWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting..");
    }
}
class MySmartPhone extends myCellPhone implements MyWifi, MyCamera{
    public void takeSnap(){
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


//    public void record4K() {
//        System.out.println("Taking snap and recording in 4k");
//    }
}
public class defaultMehtods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String[] ar = ms.getNetwork();
        ms.record4K();
        for(String item:ar){
            System.out.println(item);
        }
    }
}
