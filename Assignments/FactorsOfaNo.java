package com.assingments;

import java.util.Scanner;

public class FactorsOfaNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. :");
        int a = input.nextInt();
        for(int i = 1; i<=a; i++)
        {

            if(a%i==0)
            {
                System.out.println(i + " is a Factor of " + a);
            }
        }
    }
}
