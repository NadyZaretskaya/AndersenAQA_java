package com.andersenlab;

import static com.andersenlab.ArrayProcessing.arrayProcessing;

/*
 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
 При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
 Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
 должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и
 MyArrayDataException и вывести результат расчета.
 */

public class App {

    public static void main(String[] args) {
        String[][] toBigArray = new String[5][4];
        try {
            System.out.println("Sum of all elements is: " + arrayProcessing(toBigArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] toBigArray2 = new String[4][5];
        try {
            System.out.println("Sum of all elements is: " + arrayProcessing(toBigArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] notIntegerArray = {{"string", "1", "1", "1"},
                {"1", "string", "1", "1"},
                {"1", "1", "string", "1"},
                {"1", "1", "1", "string"}
        };

        try {
            System.out.println("Sum of all elements is: " + arrayProcessing(notIntegerArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] correctArray = {{"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };

        try {
            System.out.println("Sum of all elements is: " + arrayProcessing(correctArray));
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
    }

}
