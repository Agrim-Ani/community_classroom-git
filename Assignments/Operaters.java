package com.assingments;

import java.util.Scanner;

public class Operaters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();

        if (a>=10 && b<=10)
        {
            System.out.println("a + b = " + (a+b));
        }
        else
        {
            System.out.println("a X b = "+ (a*b));
        }
    }
}
