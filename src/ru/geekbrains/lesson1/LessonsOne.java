package ru.geekbrains.lesson1;

public class LessonsOne {

    String name="name";
    int a1=1;
    float b1=1.2f;
    double d1=2.0;
    short n2=4;
    byte d2=1;
    long c3=72;
    char B='\u0042';
    boolean pravda=true;


    public static float solveEquationMultiplication(float a, float b, float c, float d){

        return a*(b+(c/d));
    }

    public static boolean solveEquationPlus(int a, int b){
        if(((a+b)>=10)&&((a+b)<=20)){
            return true;
        }
        return false;
    }

    public static int CheakPositive(int a){
        if(a>=0){
            System.out.println("положительное число");
        }
        else
            System.out.println("отрицательное число");
        return a;
    }

    public static boolean cheakNegative(int a){
        if(a<0){
            return true;
        }
        return false;
    }
    public static String youName(String name){

        return "Привет,"+name+"!";

    }
    public static int fantasticYear(int year){
        if((year%4!=0)&&((year%100!=0)||(year%400!=0))){
            System.out.println("Не високосный год");
        }
        else{
            System.out.println("Високосный год");
        }
        return year;
    }


    public static void main(String[]args){
        System.out.println(solveEquationMultiplication(2f,4f,6f,8f));
        System.out.println(solveEquationPlus(10,2));
        CheakPositive(-2);
        System.out.println(cheakNegative(2));
        System.out.println(youName("Aleksandr"));
        fantasticYear(2020);

    }
}
