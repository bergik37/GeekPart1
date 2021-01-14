package ru.geekbrains.lessons6;

public abstract class Animal {

    protected int run;
    protected int jump;
    protected int swim;

    public void running() {}
    public void jumping() {}
    public void swimming() {}

    public Animal(int run,int jump,int swim){
        this.run=run;
        this.jump=jump;
        this.swim=swim;
    }
    public static void main(String[]args) {
        Cat[] cats = new Cat[5];
        Dog[] dogs = new Dog[5];
        for (int i = 1; i < 5; i++) {
            cats[i] = new Cat(10*i, i*i, 4*i);

            cats[i].swimming();
            cats[i].jumping();
            cats[i].running();
            dogs[i] = new Dog(5*i, 3*i, 8*i);

            dogs[i].swimming();
            dogs[i].jumping();
            dogs[i].running();
        }
    }
}
