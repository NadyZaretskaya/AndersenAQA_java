package com.andersenlab;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';
    private static final char DOT_EMPTY = '_';
    private static char[][] map;
    private static final Scanner SC = new Scanner(System.in);
    private static Random rand = new Random();

    private static final int SIZE = 5;
    private static final int WIN_RATE = 4;

    public static void main(String[] args){
        while(true) {
            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }
    }

    private static void initMap(){
        map = new char[SIZE][SIZE];
        for(int y = 0; y < SIZE; y++){
            for(int x = 0; x < SIZE; x++){
                map[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printMap(){
        for (int y = 0; y <= map.length; y++) {
            System.out.print(y + " ");
        }
        System.out.println();
        for (int x = 0; x < map.length; x++) {
            System.out.print((x + 1) + "|");
            for (int y = 0; y < map.length; y++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn(){
        int x, y;
        do{
            System.out.println("\"Введите координаты в формате X Y: ");
            x = SC.nextInt() - 1;
            y = SC.nextInt() - 1;
        }while (!isEmptyCell(x ,y) || !isValidCell(x, y));
        map[x][y] = DOT_X;
    }

    private static boolean isEmptyCell(int x, int y){
        return map[x][y] == DOT_EMPTY;
    }

    private static boolean isValidCell(int x, int y){
        return x >= 0 && x < SIZE && y >= 0 && y < SIZE;
    }

    private static void aiTurn(){
        int y;
        int x;
        do {
            y = rand.nextInt(SIZE);
            x = rand.nextInt(SIZE);
        } while (!isEmptyCell(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    private static boolean isMapFull(){
        for(int y = 0; y < SIZE; y++){
            for(int x = 0; x < SIZE; x++){
                if(isEmptyCell(x, y)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char dot) {
        int counterDiag1 = 0;
        int counterDiag2 = 0;
        int counterDiag3 = 0;
        int counterDiag4 = 0;
        for (int y = 0; y < map.length; y++) {
            int counterX = 0;
            int counterY = 0;
            for (int x = 0; x < map.length; x++) {
                if (map[y][x] == dot){
                    counterX++;
                } else counterX = 0;

                if (map[x][y] == dot){
                    counterY++;
                } else counterY = 0;
                if (counterX == WIN_RATE || counterY == WIN_RATE) return true;

                if ((y - x) >= 0) {
                    if (map[x][y - x] == dot) {
                        counterDiag1++;
                        if (counterDiag1 == WIN_RATE) return true;
                    } else counterDiag1 = 0;
                }

                if(x > 0) {
                    if (map[x][map.length - x] == dot) {
                        counterDiag2++;
                        if (counterDiag2 == WIN_RATE) return true;
                    } else counterDiag2 = 0;
                }

                if((map.length - 1 - y + x) < map.length){
                    if(map[x][map.length - 1 - y + x] == dot){
                        counterDiag3++;
                        if(counterDiag3 == WIN_RATE) return true;
                    } else counterDiag3 = 0;
                }

                if(y + x < map.length && y > 0){
                    if(map[x+y][x] == dot){
                        counterDiag4++;
                        if(counterDiag4 == WIN_RATE) return true;
                    } else counterDiag4 = 0;
                }
            }
        }
        return false;
    }

}
