package com.andersenlab;

import java.io.*;
import java.util.Scanner;

public class FileParser {

    public void getDataFromFile(File file) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        StringBuilder sbOne = new StringBuilder();
        for (int i = 0; i < AppData.getHeader().length; i++) {
            sbOne.append(AppData.getHeader()[i] + ";");
        }
        writer.write(sbOne.toString());
        StringBuilder sbTwo = new StringBuilder();
        for (int i = 0; i < AppData.getData().length; i++) {
            sbTwo.append('\n');
            for (int j = 0; j < AppData.getData()[i].length; j++) {
                sbTwo.append(AppData.getData()[i][j] + ";");
            }
        }
        writer.write(sbTwo.toString());
        writer.close();
    }

    public void inputData(File file) throws IOException {
        Scanner scanner = new Scanner(new FileReader(file));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public void save(File file) throws IOException {
        new FileWriter(file, false).close();
        getDataFromFile(file);
    }
}
