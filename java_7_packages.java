package com.company.intermediate;
import java.util.Scanner;
//import java.util.*;
public class java_7_packages {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        // java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is my scanner taking input as " + a);
    }
}