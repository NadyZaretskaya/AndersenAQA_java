package com.andersenlab;

import java.util.Arrays;


public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    public AppData(){};

    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public int getHeaderSize(){
        return this.header.length;
    }

    @Override
    public String toString() {
        return "AppDat:\n" + "header=" + Arrays.toString(header) + ",\n data=" + Arrays.deepToString(data);
    }

}
