package org.example;

import java.util.Scanner;

public class FirstTask {

    public FirstTask(){

        Scanner sc = new Scanner(System.in);

        System.out.print("1. Введите число: ");
        int number = sc.nextInt();

        if(number>7){
            System.out.println("Привет");
        } else if (number==7){
            System.out.println("Число равно семи");
        } else {
            System.out.println("Число меньше семи");
        }
    }
}
