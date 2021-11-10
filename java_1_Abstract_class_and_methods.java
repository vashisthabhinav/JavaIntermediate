package com.company.intermediate;

abstract class Parent{
    public Parent(){
        System.out.println("I am constructor of Parent class");
    }
    public void SayHello(){
        System.out.println("Hello");

    }
    abstract public void greet();
    abstract public void greet2();
    }
    class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class Child2 extends Parent{
    public void HowAreYou(){
        System.out.println("How are you");
    }
}
public class java_1_Abstract_class_and_methods {
    public static void main(String[] args) {
//        Parent p = new Parent(); //-- error
//        Child c = new Child();
//        Child2 c2 = new Child2(); //-- error
    }
}
