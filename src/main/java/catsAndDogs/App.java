package catsAndDogs;

public class App {

    public static void main(String[] args) {
        Cat cat = new Cat("Аксель");
        cat.run(200);
        cat.swim(1);

        Dog dog = new Dog("Флойд");
        dog.run(500);
        dog.swim(8);
    }
}
