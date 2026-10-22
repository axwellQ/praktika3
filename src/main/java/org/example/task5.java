package org.example;

import java.util.Scanner;

public class task5 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean work = true;
        while (work) {
            printMenu();
            String choice = scanner.next();

            if (choice.equals("1")) {
                calculate();
            } else if (choice.equals("2")) {
                printAbout();
            } else if (choice.equals("3")) {
                printDeveloper();
            } else if (choice.equals("0")) {
                work = false;
            } else {
                System.out.println("Такого пункта нет, попробуйте ещё раз.");
            }
        }
        System.out.println("Программа завершена.");
    }
    static void printMenu() {
        System.out.println();
        System.out.println("===== Главное меню =====");
        System.out.println("1 - Выполнить расчёт ИМТ");
        System.out.println("2 - Информация о программе");
        System.out.println("3 - Информация о разработчике");
        System.out.println("0 - Выход");
        System.out.print("Выберите пункт: ");
    }
    static void calculate() {
        double[] data = inputData();
        if (data[0] == 0 || data[1] == 0) {
            return;
        }
        double imt = compute(data);
        printResult(data, imt);
    }
    static double[] inputData() {
        double[] data = new double[2];
        data[0] = readNumber("Введите вес в кг (0 - вернуться в меню): ", 0, 300);
        if (data[0] == 0) {
            return data;
        }
        data[1] = readNumber("Введите рост в см (0 - вернуться в меню): ", 40, 250);
        return data;
    }
    static double readNumber(String text, int min, int max) {
        while (true) {
            System.out.print(text);
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                if (number == 0) {
                    return 0;
                }
                if (isCorrect(number, min, max)) {
                    return number;
                }
                System.out.println("Ошибка: введите число больше " + min + " и не больше " + max + ".");
            } else {
                System.out.println("Ошибка: нужно ввести число.");
                scanner.next();
            }
        }
    }
    static boolean isCorrect(double number, int min, int max) {
        if (number > min && number <= max) {
            return true;
        }
        return false;
    }
    static double compute(double[] data) {
        double weight = data[0];
        double height = data[1] / 100;
        return weight / (height * height);
    }
    static void printResult(double[] data, double imt) {
        System.out.println("Вес: " + data[0] + " кг, рост: " + data[1] + " см");
        System.out.printf("Ваш ИМТ: %.2f\n", imt);
        System.out.println("Категория: " + getCategory(imt));
    }
    static String getCategory(double imt) {
        if (imt < 18.5) {
            return "Дефицит массы тела";
        } else if (imt < 25.0) {
            return "Нормальная масса тела";
        } else if (imt < 30.0) {
            return "Избыточная масса тела (предожирение)";
        } else {
            return "Ожирение";
        }
    }
    static void printAbout() {
        System.out.println("Программа считает Индекс Массы Тела (ИМТ) по формуле: вес (кг) / рост (м)^2");
        System.out.println("и определяет категорию: дефицит массы, норма, предожирение или ожирение.");
    }
    static void printDeveloper() {
        System.out.println("Разработчики: Елькин Олег, Багин Кирилл, Кизильбаев Тамерлан.");
        System.out.println("Практическая работа № 3.");
    }
}
