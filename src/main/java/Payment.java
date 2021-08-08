/*
Создать класс Payment с внутренним классом, с помощью объектов которого
можно сформировать покупку из нескольких товаров
 */

public class Payment {

    private Item[] items;
    private int position;
    private double payment = 0;

    public Payment(int size) {
        this.items = new Item[size];
        this.position = 0;
    }

    public void addItem(String name, double price, int count) {
        if (this.position == this.items.length) {
            return;
        }
        this.items[this.position] = new Item(name, price, count);
        this.position++;
    }

    public void seePayment() {
        System.out.println("Список товаров: ");
        for (Item item : items) {
            System.out.println(item);
            payment +=  item.getPrice();
        }
        System.out.println("--------------------" + "\n" + "Стоимость покупки: " + payment + "\n");
    }

    class Item {
        private final String name;
        private final double price;
        private final int count;

        public double getPrice() {
            return price;
        }

        public Item(String name, double price, int count) {
            this.name = name;
            this.price = price;
            this.count = count;
        }

        @Override
        public String toString() {
            return "Товар             " + name + "\n" +
                    "Стоимость за ед.  " + price + "\n" +
                    "Колличество       " + count + "\n";
        }
    }

}
