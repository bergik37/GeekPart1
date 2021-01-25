package ru.geekbrains.lessons7;

public class Plate {
    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        //this.food=food;
        if(food<=0)
            System.out.println("нужно добавить еды в миску");
        else
            this.food=food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n){
        food-=n;
    }

    public void info(){
        System.out.println("plate:"+getFood());
    }

    public void extraFood(int i) {
        System.out.println("Добавте еще "+(0-food)+" грамм корма, что бы все коты были ссыты");
    }
}
