package catsWithPlate;

/*
5. Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
* Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды,
 а кот пытается покушать 15-20).
* Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды),
 сытость = true.
* Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
(это сделано для упрощения логики программы).
* Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о
 сытости котов в консоль.
* Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
*/

public class App {

    public static void main(String[] args) {
        Cat[] cats = {new Cat("Floid", 7), new Cat("Sky", 5), new Cat("Apollo", 15)};
        Plate plate = new Plate(15);
        System.out.println("List of cats:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        System.out.println("Feed cats:");
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
        System.out.println("***********************************************");
        System.out.println("Increase food by 20");
        plate.increaseFood(20);
        System.out.println(plate);
    }

}
