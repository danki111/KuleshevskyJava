package org.example;

import java.util.Scanner;

public class ThirdTask {

    public ThirdTask(){

        Scanner sc = new Scanner(System.in);

        System.out.print("3. Введите количество элементов массива: ");
        int amountElements = sc.nextInt();

        //Проверка количества элементов
        if(amountElements>0) {

            int[] arrMultiple = new int[amountElements];

            //Ввод элементов
            for (int i = 0; i < amountElements; i++) {
                System.out.print("Введите " + (i+1) + "-й элемент массива: ");
                arrMultiple[i] = sc.nextInt();
            }

            //Проверка элементов и вывод из них кратных трём
            System.out.print("Элементы введенного массива кратные трём: ");
            for (int j : arrMultiple) {
                if ((j % 3) == 0) {
                    System.out.print(j + " ");
                }
            }
        } else {
            System.out.print("Вы ввели недопустимое количество элементов");
        }
    }
}
