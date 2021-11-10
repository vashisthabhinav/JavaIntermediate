package com.company.intermediate;

import java.util.Scanner;

public class java_17_Nested_Try_Catch {
    public static void main(String[] args) {
        int [] marks = new int[12];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        marks[3] = 27;
        marks[4] = 546;
        marks[5] = 126;
        marks[6] = 721;
        marks[7] = 565;
        marks[8] = 63;
        marks[9] = 754;
        marks[10] = 5346;
        marks[11] = 654;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for using this program");
    }
}
