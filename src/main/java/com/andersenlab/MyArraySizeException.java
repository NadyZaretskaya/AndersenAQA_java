package com.andersenlab;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(int i, int j) {
        super("Allowed array size is [4][4]. Provided array is [" + i + "][" + j + "]");
    }

}