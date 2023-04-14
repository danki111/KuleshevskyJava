package org.example;

import java.util.Scanner;

public class SecondTask {

    public SecondTask(){

        Scanner sc = new Scanner(System.in) ;

        System.out.print("2. Введите имя: ");
        String name = sc.nextLine();

        if (name.equals("Вячеслав")||name.equals("вячеслав")){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
