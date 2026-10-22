package org.example;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Введите " + n + " элементов массива:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Номера одинаковых элементов: " + (i + 1) + " " + (j + 1));
                }
            }
        }
    }
}
