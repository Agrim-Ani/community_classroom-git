package com.assignments;


import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num + " is an even no.");
        }
        else if (num%2==1){
            System.out.println(num + " is an odd no. ");
        }
    }

}
