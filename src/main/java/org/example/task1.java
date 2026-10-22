package org.example;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N (нечётное): ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        System.out.println("Введите " + n + " элементов массива:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = n - 1; i >= 0; i -= 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
