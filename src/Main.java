public class Main {
    public static void main(String[] args) {
        System.out.println("Акция!За каждые 20 рублей, потраченные на билет, начисляется 1 миля.");
        int x = 3700; // Цена билета
        int y = 20; // Количество рублей для одной бонусной мили

        int bonus = x / y;
        System.out.println("Количество ваших бонусных миль = " + bonus);

        System.out.println("Благодарим за выбор нашей авиакомании!");

    }
}
