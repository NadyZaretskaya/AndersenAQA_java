package com.andersenlab;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWorkApp {

    public static void main(String[] args) throws IOException {
        printThreeWords();
        checkSumSing(-18, 95);
        printColor(-1);
        compareNumbers(56, 94);
        compareNumbers_2();
    }

    /*
    Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
    */
    private static void printThreeWords() {
        System.out.println("Orange" + "\nBanana" + "\nApple\n");
    }

    /*
    Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
    значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
    то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    */
    private static void checkSumSing(int a, int b) {
        int sum = a + b;
        if (sum >= 0)
            System.out.println("Сумма положительная\n");
        else
            System.out.println("Сумма отрицательная\n");
    }

    /*Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением.
     Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах
     от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    */
    private static void printColor(int value) {
        String redColor = "\033[0;31m";
        String greenColor = "\033[0;32m";
        String yellowColor = "\033[0;33m";
        String resetColor = "\033[0m";

        if (value <= 0)
            System.out.println(redColor + "Красный\n" + resetColor);
        else if (value > 0 && value <= 100)
            System.out.println(yellowColor + "Желтый\n" + resetColor);
        else
            System.out.println(greenColor + "Зеленый\n" + resetColor);
    }

    /*
    Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми
    значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
    в противном случае “a < b”;
    */
    private static void compareNumbers(int a, int b) {     //5
        String result = (a >= b) ? "a >= b" : "a < b";
        System.out.println(result);
    }

    private static void compareNumbers_2() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nДавай попробуем инициализировать переменные самостоятельно\n");
            System.out.println("Введите число 'a' ->");
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Введите число 'b' ->");
            int b = Integer.parseInt(reader.readLine());
            String result = (a >= b) ? "a >= b" : "a < b";
            System.out.println(result);
            reader.close();
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Вам нужно ввести целое число от -2147483648 до 2147483647!");
            compareNumbers_2();
        }
    }

}
