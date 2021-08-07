package com.agrim;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //type casting(smaller ones get promoted to larger ones only not the other way back)
        int a = (int)(56.76f);
        System.out.println(a);
        int c = 257;
        byte b = (byte)(c); //257 % 256 = 1
        System.out.println(b);
        int number = 'A';
        System.out.println(number);// prints ASCII os A = 65
        //bytes are automatically promoted to integer in mathematical equation

//        float num1 = input.nextFloat();
//        float num2 = input.nextFloat();
//
//
//        int sum = (int)(num1) + (int)(num2);
//
//        System.out.println((float)(sum));
    }
}
