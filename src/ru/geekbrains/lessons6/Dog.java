package ru.geekbrains.lessons6;

public class Dog extends Animal{

        public Dog(int run, int jump, int swim) {
            super(run, jump, swim);
        }

    @Override
    public void running() {
        if(run>0&&run<=150)
            System.out.println("Коротколапый пес "+run);
        else if(run>150&&run<=500)
            System.out.println("Обычный пес "+run);
        else if(run>500&&run<=1200)
            System.out.println("Беговой пес "+run);
        else
            System.out.println("Собаки столько не бегают "+run);
    }

    @Override
    public void jumping() {
        if(jump>0&&jump<=1)
            System.out.println("Коротколапый пес "+jump);
        else if(jump>1&&jump<=2)
            System.out.println("Обычный пес "+jump);
        else if(jump>2&&jump<=7)
            System.out.println("Очень прыгучей пес "+jump);
        else
            System.out.println("Собаки столько не прыгают "+jump);
    }

    @Override
    public void swimming() {
        if(swim<1200)
            System.out.println("Собаки хорошо плавают");
            else
            System.out.println("Столько собака не плавает");
        }
    }


