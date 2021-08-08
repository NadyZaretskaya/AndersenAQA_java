package catsAndDogs;

public class Cat extends Animal{

    private final int MAX_RUN_LENGTH = 200;
    private static int catCount = 0;

    public Cat(String name){
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void swim(int distance){
        System.out.println("Я же кот! Я не умею плавать!");
    }

    @Override
    public void run( int distance){
        if(distance<=MAX_RUN_LENGTH && distance>0) {
            System.out.println(getName() + " пробежал " + distance + " м.");
        } else {
            System.out.println("Я столько не пробегу");
        }
    }




}
