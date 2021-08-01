package com.andersenlab;

import java.io.IOException;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.concurrent.ThreadLocalRandom;

public class App {

    public static void main(String[] args) throws IOException {
        System.out.println(checkSumm(15,6));
        checkNumberPositiveOrNegative(-999);
        System.out.println(checkNumberIsNegative(-666));
        printString("I love Java", 3);
        System.out.println(checkIsLeapYear(1600));
        updateBinarArray();
        createArray(100);
        updateNumberLessThanSix();
        setOneToArrayDiagonals(12);
        System.out.println(Arrays.toString(createInitialValueArray(12, 6)));
        getMinAndMaxFromGeneratedArray(generateRandomIntArray(13));
        compareParts(generateRandomIntArray(5));
        arrayTrain(generateRandomIntArray(6), -2);
    }

    /*
     Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
     (включительно), если да – вернуть true, в противном случае – false.
    */
    private static boolean  checkSumm(int a, int b) {
        return((a + b) >= 10 && (a + b) <= 20);
    }

    /*
    Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    */
    private static void checkNumberPositiveOrNegative(int a) {
        System.out.println((a >= 0) ? ("Число положительное") : ("Число отрицательное"));
    }

    /*
    Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    отрицательное, и вернуть false если положительное.
    */
    private static boolean checkNumberIsNegative(int a) {
        return a < 0;
    }

    /*
     Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
     указанную строку, указанное количество раз;
     */
    private static void printString(String str, int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println(str);
        }
    }

    /*
    Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
    не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */
    private static boolean checkIsLeapYear(int year) {
        GregorianCalendar gCalendar = new GregorianCalendar();
        return gCalendar.isLeapYear(year);
//        если проверять через условия, то будет так:
//        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    /*
     Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void updateBinarArray() {
        int[] binArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < binArray.length; i++) {
            binArray[i] = (binArray[i] == 1) ? 0 : 1;
        }
        System.out.println(Arrays.toString(binArray));
    }

    /*
    Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    private static void createArray(int a) {
        int[] myArr = new int[a];
        for (int i = 0; i < myArr.length;) {
            myArr[i] = ++i;
        }
        System.out.println(Arrays.toString(myArr));
    }

    /*
     Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static void updateNumberLessThanSix() {
        int[] myArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] < 6) {
                myArr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(myArr));
    }

    /*
    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
    заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    private static void setOneToArrayDiagonals(int a) {
        int[][] massive = new int[a][a];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if ((i == j) || (i + j ==(massive.length-1))) {
                    massive[i][j] = 1;
                }
                System.out.print(massive[i][j]);
            }
            System.out.println();
        }
    }

    /*
    Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
    длиной len, каждая ячейка которого равна initialValue;
     */
    private static int[] createInitialValueArray(int len, int initialValue) {
        int[] myArr = new int[len];
        for (int i = 0; i < len; i++) {
            myArr[i] = initialValue;
        }
        return myArr;
    }

    /*
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы;
     */
    private static void getMinAndMaxFromGeneratedArray(int[] array) {
        findMax(array);
        findMin(array);
    }

    private static int[] generateRandomIntArray(int n) {
        int[] array = ThreadLocalRandom.current().ints().limit(n).toArray();
        System.out.println("Сгенерированный массив: " + Arrays.toString(array));
        return array;
    }


    private static void findMax(int[] arr) {
        int maxIndex = 0;
        int max = arr[maxIndex];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальный элемент в массиве: " + max);
    }

    private static void findMin(int[] array) {
        int minIndex = 0;
        int min = array[minIndex];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент в массиве: " + min);
    }

    /*
     ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
    private static boolean compareParts(int[] arr) {
        int sum = 0;
        boolean result = false;
        for (int i : arr) {
            sum += i;
        }
        int sumRight = 0;
        for (int value : arr) {
            sumRight += value;
            if (sumRight == sum - sumRight) {
                result = true;
            }
        }
        System.out.println(result);
        return result;
    }

    /*
     *** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
     или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
     Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
     (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую
     сторону сдвиг можете выбирать сами.
     */

    public static void arrayTrain(int[] arr, int n) {
        if (n < 0) {
            n = -n;
            for (int i = 1; i <= n; i++) {
                int a = arr[0];
                for (int x = 0; x < arr.length; x++) {
                    if (x == arr.length - 1) {
                        arr[x] = a;
                    } else {
                        arr[x] = arr[x+1];
                    }
                }
            }
        } else {
            for (int j = 1; j <= n; j++) {
                int b = arr[arr.length-1];
                for (int y = arr.length-1; y >=0; y--) {
                    if (y == 0) {
                        arr[y] = b;
                    } else {
                        arr[y] = arr[y-1];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
