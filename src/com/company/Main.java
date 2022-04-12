package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("|Задание 1|");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int expenses : arr) {
            sum += expenses;
        }
        System.out.print("Сумма трат за месяц составила " + sum + " рублей." + "\n");
        System.out.println("|Задание 2|");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // Вывод для наглядности
        int minExpense = arr[0];
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей.");
        int maxExpense = arr[arr.length - 1];
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей.");
        System.out.println("|Задание 3|");
        double average = 0;
        for (int i : arr) {
            average += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average / arr.length + " рублей.");
        System.out.println("|Задание 4|");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int x = reverseFullName.length; x >= 0; x--) {
            if (x < reverseFullName.length) {
                System.out.print(reverseFullName[x]);
            }
        }
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}


