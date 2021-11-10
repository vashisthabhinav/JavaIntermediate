package com.company.intermediate;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){

        while(true){
            System.out.println("Thank you: " + this.getName());
        }

    }
}

public class java_11_Thread_priorities {
    public static void main(String[] args) {
        // Ready Queue: T1 T2 T3 T4 T5
        MyThr t1 = new MyThr("Abhinav1");
        MyThr t2 = new MyThr("Abhinav2");
        MyThr t3 = new MyThr("Abhinav3");
        MyThr t4 = new MyThr("Abhinav4");
        MyThr t5 = new MyThr("Abhinav5 (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
