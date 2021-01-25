package ru.geekbrains.lessons7;

public class Cat {
    private int appetite;
    private String name;
    private boolean hungry=false;

    public Cat(String name, int appetite,boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry=hungry;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }




    public void eat(Plate p) {
        p.decreaseFood(appetite);

    }
    public boolean hungry(Plate p){
        if(p.getFood()<=0)
            System.out.println(name+" кот голодный");
        else
            System.out.println(name+" сыт");
            return true;

    }
}
