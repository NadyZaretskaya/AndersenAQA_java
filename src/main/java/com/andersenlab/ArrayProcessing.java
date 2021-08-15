package com.andersenlab;

public class ArrayProcessing {

    public static int arrayProcessing(String[][] array) throws RuntimeException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (4 != array.length | 4 != array[i].length) throw new MyArraySizeException(array.length, array[i].length);
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    Throwable x = new MyArrayDataException("Invalid value in: [" +
                            i + "][" + j + "] " + e.getMessage());
                    x.printStackTrace();
                }
            }
        }
        return sum;
    }

    }

