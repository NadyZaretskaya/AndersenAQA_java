package catsAndDogs;

public class App {

    public static void main(String[] args) {
        Cat cat = new Cat("Аксель");
        Cat cat1 = new Cat("Джон");
        Cat cat2 = new Cat("Аполло");
        cat.run(200);
        cat.swim(1);

        Dog dog = new Dog("Флойд");
        Dog dog1 = new Dog("Скай");
        dog.run(500);
        dog.swim(8);

        System.out.println("Общее количество животных: " + Animal.getCount());
        System.out.println("Общее количество кисунь: " + Cat.getCatCount());
        System.out.println("Общее количество собакенов: " + Dog.getDogCount());

    }
}
