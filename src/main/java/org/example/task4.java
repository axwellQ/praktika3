package org.example;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите порядок матрицы N (нечётное): ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Введите матрицу " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        System.out.println("Элементы по спирали против часовой стрелки:");
        while (top < bottom) {
            for (int i = top; i < bottom; i++) {
                System.out.print(a[i][left] + " ");
            }
            for (int j = left; j < right; j++) {
                System.out.print(a[bottom][j] + " ");
            }
            for (int i = bottom; i > top; i--) {
                System.out.print(a[i][right] + " ");
            }
            for (int j = right; j > left; j--) {
                System.out.print(a[top][j] + " ");
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        System.out.println(a[top][left]);
    }
}
