package ru.geekbrains.lessons4;

import java.util.Random;
import java.util.Scanner;

public class LessonsFour {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '∙';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map=new char[SIZE][SIZE];
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Выиграл человек");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Выиграл ПК");
                break;
            }
        }
    }
    public static boolean checkWin(char symb) {
        if(checkWinVertGoriz(symb))return true;
        return checkWinDiag(symb);
    }


    private static boolean checkWinDiag(char symb) {
        int oneDiag = 0;
        int secondDiag = 0;
        for (int i = 0; i < SIZE; i++) {
            oneDiag = (map[i][i] == symb) ? oneDiag+1 : 0;
            secondDiag = (map[i][map.length - 1 - i] == symb) ? secondDiag + 1 : 0;
            if (oneDiag == DOTS_TO_WIN || secondDiag == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;

    }
    public static boolean checkWinVertGoriz(char symb) {
        for (int i = 0; i < SIZE; i++) {
            int countGor=0;
            int countVert=0;
            for (int j = 0; j < SIZE; j++) {
                countGor = (map[i][j] == symb) ? countGor + 1 : 0;
                countVert = (map[j][i] == symb) ? countVert+ 1 : 0;
                if (countGor == DOTS_TO_WIN || countVert == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }
            /*if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;*/
    //return false;

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
