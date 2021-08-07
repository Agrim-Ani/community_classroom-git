package com.agrim;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer value of a");
         int a = input.nextInt();
        System.out.println("Enter integer value of b");
         int b = input.nextInt();
         int sum =  a + b;
        System.out.println("=> a + b = "+sum);
    }
}
