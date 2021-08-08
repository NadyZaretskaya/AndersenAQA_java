package catsWithPlate;

public class Plate {

    private int amountOfFood;

    Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    public int getAmountOfFood() {
        return amountOfFood;
    }

    void decreaseFood(int appetite) {
        if (amountOfFood >= appetite) {
            amountOfFood -= appetite;
        }
    }

    public void increaseFood(int amount) {
        amountOfFood += amount;
    }

    @Override
    public String toString() {
        return "Food in the plate: " + amountOfFood;
    }

}
