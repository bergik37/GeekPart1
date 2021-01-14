package ru.geekbrains.lessons6;

public class Cat extends Animal{
    public Cat(int run, int jump, int swim) {
        super(run, jump, swim);
    }

    @Override
    public void running() {
        if(run>0&&run<=10)
            System.out.println("Домашний кот дистанция "+run);
        else if(run>10&&run<=125)
            System.out.println("Дворовый кот дистанция "+run);
        else if(run>125&&run<=440)
            System.out.println("Крупный кот из семейства кошачих дистанци "+run);
        else
            System.out.println("Коты столько не бегают дистанция "+run);
    }

    @Override
    public void jumping() {
        if(jump>0&&jump<=2)
            System.out.println("Домашний кот прыжок "+jump);
        else if(jump>2&&jump<=5)
            System.out.println("Дворовый кот прыжок "+jump);
        else if(jump>5&&jump<=90)
            System.out.println("Крупный кот из семейства кошачих прыжок "+jump);
        else
            System.out.println("Коты столько не прыгают прыжок "+jump);
    }

    @Override
    public void swimming() {
        if(swim!=0){
            System.out.println("Коты не плавают");
        }
    }
}

