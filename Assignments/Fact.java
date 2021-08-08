package com.assingments;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. to calculate is factorial :");
        int x = input.nextInt();
        int fact = 1;
        for(int i = x; i>=1; i--){
            fact*=i;
        }

        System.out.println("Factorial of no. is " + fact);

    }
}
