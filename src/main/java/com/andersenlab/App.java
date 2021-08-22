package com.andersenlab;

/*
 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер
 телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 тогда при запросе такой фамилии должны выводиться все телефоны.
 */

public class App {
    public static void main( String[] args ) {

        String[] stringArray = {"Массив", "Коллекция", "Лист", "Очередь", "Мэп", "массив", "коллекция", "лИсТ", "очередь",
                "Map", "HashSet", "SortedSet", "sortedSet", "hashset", "Array"};
        StringArray.getUnicsValues(stringArray);
        StringArray.countDuplicates(stringArray);

        System.out.println("\n-------------------\n");

        PhoneBook newPhoneBook = new PhoneBook();
        newPhoneBook.add("Зарецкая", "+375295445621");
        newPhoneBook.add("Ильюшин", "+375295445621");
        newPhoneBook.add("Иванов", "+375295438204");
        newPhoneBook.add("Иванов", "+375295438204");
        newPhoneBook.add("Зарецкая", "+375212123456");

        newPhoneBook.get("Зарецкая");
        newPhoneBook.get("Ильюшин");
        newPhoneBook.get("Иванов");
        newPhoneBook.get("Петров");
    }
}

