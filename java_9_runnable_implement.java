package com.company.intermediate;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i;
        for(i=0;i<=3000;i++){
            System.out.println("Thread-1");
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i;
        for(i=0;i<=3000;i++){
            System.out.println("Thread-2");
        }
    }
}
public class java_9_runnable_implement {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
