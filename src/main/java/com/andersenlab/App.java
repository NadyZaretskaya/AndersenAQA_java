package com.andersenlab;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/*
Реализовать сохранение данных в csv файл;
Реализовать загрузку данных из csv файла. Файл читается целиком.
Структура csv файла:
Строка заголовок с набором столбцов
Набор строк с целочисленными значениями
* Разделитель между столбцами - символ точка с запятой (;)
Пример:
Value 1;Value 2;Value 3
100;200;123
300,400,500
Для хранения данных использовать класс вида:
public class AppData {
    private String[] header;
    private int[][] data;
    // ...
}
Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
 */

public class App {
    public static void main(String[] args) throws IOException {
        FileParser fp = new FileParser();
        File path = new File("").getAbsoluteFile();
        String pathToFile = path.getAbsolutePath() + "/file.csv";

        String[] header = new String[]{"Value 1", "Value 2", "Value 3", "Value 4"};
        int[][] data = new int[][]{{100, 200, 123}, {300, 400, 500, 700}, {600, 700, 800}, {999, 666, 777}};
        AppData appData = new AppData(header, data);
        String separator = ";";
        //Сохранить объект в файл
        fp.save(pathToFile, appData, separator);
        //Получить объект из файла
        appData = fp.read(pathToFile, separator);
        System.out.println(appData);

        //Перезаписать данные в файле
        String[] header1 = new String[]{"New Values", "Override", "Previous", "File"};
        int[][] data1 = new int[][]{{1000, 2000, 1234}, {3000, 4000, 5000, 7000}, {6000, 7000, 8000}, {9999, 6666, 7777}};
        AppData appData1 = new AppData(header1, data1);
        fp.save(pathToFile, appData1, separator);

    }
}
