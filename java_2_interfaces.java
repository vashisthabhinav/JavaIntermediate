package com.company.intermediate;
interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{
    //public int x = 5;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    }
}
public class java_2_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        // You can create properties in Interfaces
        System.out.println(cycleHarry.a);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        //System.out.println(cycleHarry.a);
    }
}
