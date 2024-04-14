package org.example.second;

public class Main {
    public static void main(String[] args) {
        Candy candy1 = new Candy("\"Степ\"", 46.90, 100, "молочный");
        Candy candy2 = new Candy("\"Линдор\"", 867.00, 200, "белый");
        Marmelade marmelade1 = new Marmelade("\"Кровавые глаза\"", 230.00, 96, "малиновый");
        Marmelade marmelade2 = new Marmelade("\"Змейки\"", 320.00, 124, "яблочный");

        Sweets[] box = {candy1, candy2, marmelade1, marmelade2};

        double totalWeight = 0;
        double totalPrice = 0;

        for (Sweets someSweets : box) {
            totalWeight += someSweets.getWeight();
            totalPrice += someSweets.getPrice();
        }

        System.out.println("Сладкий подарок:");
        for (Sweets someSweets : box
        ) {
            System.out.println(someSweets.toString());
        }
        System.out.println("");
        System.out.println("Общий вес подарка: " + totalWeight + " г");
        System.out.println("Общая стоимость подарка: " + totalPrice + " руб.");
    }
}