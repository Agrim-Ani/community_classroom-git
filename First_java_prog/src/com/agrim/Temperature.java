package com.agrim;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        //Temperature convertion °C--->°F
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter Temp. in °C :");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temp. in Fahrenheit is " + tempF + "°F");


    }
}
