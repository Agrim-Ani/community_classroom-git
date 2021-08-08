package com.assingments;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Start entering integers : ");
        int a= input.nextInt();
        int max = a;
        while (a!=0)
        {

         a = input.nextInt();
         if(a>max)
         {
             max=a;
         }


        }
        System.out.println("Max of all no. is =  "+ max);
    }
}





