package com.assingments;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is you name?");
        String name = input.nextLine();
        System.out.println("Hello! "+ name +  " Welcome;\nHow Are you?");
    }
}
