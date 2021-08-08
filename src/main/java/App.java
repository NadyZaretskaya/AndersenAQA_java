public class App {
    public static void main(String[] args) {
        Payment payment = new Payment(3);
        payment.addItem("Пенка для умывания", 15.55, 1);
        payment.addItem("Туш", 26.96, 1);
        payment.addItem("Лайнер", 19.05, 1);
        payment.seePayment();


        Park park = new Park(5);
        park.addAttraction("Солнышко", "10:00", "20:00", 2);
        park.addAttraction("Лодочка", "10:00", "20:00", 2);
        park.addAttraction("Батут", "12:00", "20:00", 5);
        park.addAttraction("Чертово колесо", "12:00", "22:00", 6);
        park.parkAttraction();


    }
}
