package catsWithPlate;

public class Cat {

    private String name;
    private int appetite;
    private boolean isFull;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return isFull;
    }

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    @Override
    public String toString() {
        return "Cat: " + name + " | Appetit: " + appetite + " | Satiety: " + isFull;
    }

    void eat(Plate plate) {
        if (plate.getAmountOfFood() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        } else {
            System.out.println("Cat " + name + " is still hungry!");
        }
    }

}
