package catsAndDogs;

public class Dog extends Animal{

    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;
    private static int dogCount = 0;

    public static int getDogCount() {
        return dogCount;
    }

    public Dog(String name){
        super(name);
        dogCount++;
    }

    @Override
    public void swim(int distance){

        if(distance<=MAX_SWIM_LENGTH && distance>0) {
            System.out.println(getName() + " проплыл " + distance + " м.");
        } else {
            System.out.println("Я столько не проплыву!");
        }
    }

    @Override
    public void run(int distance){
        if(distance<=MAX_RUN_LENGTH && distance>0) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println("Я столько не пробегу!");
        }
    }



}
