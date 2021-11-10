package com.company.intermediate;
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");
        while(i<=100){
            System.out.println("I am a thread");
            i++;
        }
    }
}
abstract class MyThr2 implements Runnable{

}
public class java_10_Constructors_in_threads {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Abhinav");
        MyThr1 t2 = new MyThr1("Chirag");
        t1.start();
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The name of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getId());
        System.out.println("The name of the thread t is " + t2.getName());

    }
}
