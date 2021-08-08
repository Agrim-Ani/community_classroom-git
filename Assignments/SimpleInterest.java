package com.assingments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" P = ");
        float P = input.nextFloat();
        System.out.print(" R = ");
        float R = input.nextFloat();
        System.out.print(" T = ");
        float T = input.nextFloat();
        float SI = (P*R*T)/100;
        System.out.println(" S.I. = " + SI );
    }
}
