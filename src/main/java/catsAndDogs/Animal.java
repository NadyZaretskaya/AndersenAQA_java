package catsAndDogs;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом
    выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
    собака 10 м.).
4. * Добавить подсчет созданных котов, собак и животных.
 */

public abstract class Animal
{
    private String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    public void swim(int distance){
        System.out.println(name + " проплыл " + distance + " м.");
    }

    public void run( int distance){
        System.out.println(name + " пробежал " + distance + " м.");
    }
}
