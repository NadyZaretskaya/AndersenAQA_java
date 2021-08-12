package org.example;

import java.util.Arrays;

 /*
 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 ----------------------------
 2. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя
 сложить и яблоки, и апельсины;
 Для хранения фруктов внутри коробки можно использовать ArrayList;
 Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f,
 апельсина – 1.5f (единицы измерения не важны);
 Внутри класса Box  сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare()
 в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и
 апельсинами;
 Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя
 яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 Не забываем про метод добавления фрукта в коробку.
 */

public class App 
{
    public static void main( String[] args ) {
        String[] arr = {"asd", "ds", "ret", "123"};
        System.out.println("Задача №1\n" + Arrays.toString(arr));
        swapElements(arr, 1, 2);
        System.out.println(Arrays.toString(arr));
        swapElements(arr, 3, 4);

        System.out.println("\nЗадача №2");
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        System.out.println("Вес коробки 1 с апельсинами: " + orangeBox1.getBoxWeight());
        System.out.println("Вес коробки 2 с апельсинами: " + orangeBox2.getBoxWeight());
        System.out.println("Вес коробки с яблоками: " + appleBox.getBoxWeight());

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.replaceAllFruitsToAnotherBox(orangeBox2);
        // Попытка сложить разные фрукты в одну коробку вызовет ошибку
//        orangeBox1.replaceAllFruitsToAnotherBox(appleBox);

        System.out.println("Вес коробки 1 после перемещения: " + orangeBox1.getBoxWeight());
        System.out.println("Вес коробки 2 после перемещения: " + orangeBox2.getBoxWeight());
    }


    private static <T> void swapElements(T[] arr, int i, int j) {
        try {
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Указанные индексы не входят в ваш массив!");
        }
    }
}
