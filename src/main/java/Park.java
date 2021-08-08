/*
Создать класс Park с внутренним классом, с помощью объектов которого можно
хранить информацию об аттракционах, времени их работы и стоимости
 */

public class Park {
    private Attraction[] attraction;
    private int position;

    public Park(int size) {
        this.attraction = new Attraction[size];
        this.position = 0;
    }

    public void addAttraction(String name, String startTime, String endTime, double price) {
        if (this.position == this.attraction.length - 1) {
            return;
        }
        this.attraction[this.position] = new Attraction(name, startTime, endTime, price);
        this.position++;
    }

    public void parkAttraction() {
        System.out.println("Список аттракционов: ");
        for (int i = 0; i < position; i++) {
            System.out.println(this.attraction[i]);
        }
    }

    class Attraction {
        private final String name;
        private final String startTime;
        private final String endTime;
        private final double price;

        public Attraction(String name, String startTime, String endTime, double price) {
            this.name = name;
            this.startTime = startTime;
            this.endTime = endTime;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Аттракцион      " + name + "\n" +
                    "Время начала    " + startTime + "\n" +
                    "Время окончания " + endTime +"\n" +
                    "Стоимость       " + price +"\n";
        }
    }
}
