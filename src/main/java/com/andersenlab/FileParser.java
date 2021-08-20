package com.andersenlab;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
    public void save(String fileName, AppData appData, String separator) {
        try (BufferedWriter in = new BufferedWriter(new FileWriter(fileName))) {
            StringBuilder sbOne = new StringBuilder();
            for (int i = 0; i < appData.getHeaderSize(); i++) {
                sbOne.append(appData.getHeader()[i] + separator);
            }
            in.write(sbOne.toString());
            StringBuilder sbTwo = new StringBuilder();
            for (int i = 0; i < appData.getData().length; i++) {
                sbTwo.append('\n');
                for (int j = 0; j < appData.getData()[i].length; j++) {
                    sbTwo.append(appData.getData()[i][j] + separator);
                }
            }
            in.write(sbTwo.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AppData read(String fileName, String separator) {
        AppData appData = new AppData();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            List<String[]> rows = new ArrayList<>();
            String row;
            while ((row = br.readLine()) != null) {
                rows.add(row.split(separator));
            }
            appData.setHeader(rows.get(0)) ;
            rows.remove(0);
            appData.setData(new int[rows.size()][appData.getHeaderSize()]);
            int[][] data = new int[rows.size()][appData.getHeaderSize()];
            for (int i = 0; i < rows.size(); i++) {
                String[] strings = rows.get(i);
                for (int j = 0; j < strings.length; j++) {
                    data[i][j] = Integer.parseInt(strings[j]);
                }
                appData.setData(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid csv file. Data size bigger than header");
        }
        return appData;
    }

}
