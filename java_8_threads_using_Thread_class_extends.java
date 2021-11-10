package com.company.intermediate;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<3000){
            System.out.println("Thread 1");
            System.out.println("Task 1");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while(i<40000){
            System.out.println("Thread 2");
            System.out.println("Task 2");
            i++;
        }
    }
}
public class java_8_threads_using_Thread_class_extends {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}
