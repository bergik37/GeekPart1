package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class LessonsThree {
    public static Scanner keybord = new Scanner(System.in);

    public static int getNumberFromScanner(String message) {
        int x;
        int count=0;
        Random rand = new Random();
        int y = rand.nextInt(10);
        while (true){
            // System.out.println(y);
            System.out.println(message);
            x = keybord.nextInt();
            if ((y != x) && (x > y)) {
                System.out.println("Число больше,чем загаданое");
            } else if ((y != x) && (x < y)) {
                System.out.println("Число меньше,чем загаданое");
            } else {
                System.out.println("Вы угадали.Нажмите 1 чтобы продолжить и 0 если хотите закончить");
                x = keybord.nextInt();
                if(x==0) {
                    break;
                }
                else if(x==1){
                    y = rand.nextInt(10);
                    count=0;
                }
            }
            count++;
            if(count==3) {
                System.out.println("Игра закончена. Нажмите 1 чтобы продолжить и 0 если хотите закончить");
                x = keybord.nextInt();
                if(x==0) {
                    break;
                }
                else if(x==1){
                    y = rand.nextInt(10);
                    count=0;
                }
            }
        }
        return x;
    }

    public static void main(String[] args) {
        getNumberFromScanner("Угадайте число в пределах от 0 до 9");
    }
}
