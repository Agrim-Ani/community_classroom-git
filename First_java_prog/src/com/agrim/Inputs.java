package com.agrim;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter Roll no.");

        int rollno = input.nextInt();

        System.out.println("Your Roll number is " + rollno);
        System.out.println("Please enter your name.");

        String name = input.nextLine(); //its not taking name..why??

        System.out.println("Your name is " + name);
        System.out.println("Please enter your marks ");
        float marks = input.nextFloat();
        System.out.println("Your marks are "+marks);

    }
}
