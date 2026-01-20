package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter number from 1 to 9");
        int input= sc.nextInt();

        if(input == 1)
            System.out.println("one");
        else if(input == 2)
            System.out.println("two");
        else if(input == 3)
            System.out.println("three");
        else if(input == 4)
            System.out.println("four");
        else if(input == 5)
            System.out.println("five");
        else if(input == 6)
            System.out.println("six");
        else if(input == 7)
            System.out.println("Seven");
        else if(input == 8)
            System.out.println("eight");
        else if(input == 9)
            System.out.println("nine");
        else
            System.out.println("enter integer from 1 to 10");

        }
    }

