package com.company.intermediate;

class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(i<=30){
//            System.out.println("I am a thread");
            System.out.println("Thank you: ");
            i++;
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
        int i =0;
        while(i<=30){
//            System.out.println("I am a thread");
            System.out.println("My Thank you: ");
            i++;
        }
    }
}public class java_12_Threads_Methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println(e);
        }

        t2.start();
    }
}
