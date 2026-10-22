package org.example;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        double[] a = new double[n];
        System.out.println("Введите " + n + " элементов массива:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }
        double[] b = makeAverages(a);
        System.out.println("Массив B:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", b[i]);
        }
        System.out.println();
    }
    static double[] makeAverages(double[] a) {
        int n = a.length;
        double[] b = new double[n];
        for (int k = 0; k < n; k++) {
            double sum = 0;
            for (int i = k; i < n; i++) {
                sum += a[i];
            }
            b[k] = sum / (n - k);
        }
        return b;
    }
}
