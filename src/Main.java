public class Main {
    public static void main(String[] args) {
        System.out.println("Акция!За каждые 20 рублей, потраченные на билет, начисляется 1 миля.");
        int ticketPrice = 3700; // Цена билета
        int forMiles  = 20; // Количество рублей для одной бонусной мили

        int bonus = ticketPrice / forMiles;
        System.out.println("Количество ваших бонусных миль = " + bonus);

        System.out.println("Благодарим за выбор нашей авиакомании!");

    }
}
