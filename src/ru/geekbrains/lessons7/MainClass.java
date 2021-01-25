package ru.geekbrains.lessons7;

public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat cat[]=new Cat[3];
        cat [0]= new Cat("Barsik", 25,false);
        cat [1]= new Cat("Snegok", 55,false);
        cat [2]= new Cat("Ygin", 45,false);

        plate.info();
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            cat[i].hungry(plate);
            plate.info();
        }
        plate.extraFood(20);


    }
}
