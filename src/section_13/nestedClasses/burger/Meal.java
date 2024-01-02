package section_13.nestedClasses.burger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Meal {

    private double price = 5.0;
    private Item burger;
    private Item drink;
    private Item side;
    private double conversionRate;

    public Meal() {
        this(1);
    }

    public Meal(double conversionRate) {
        this.conversionRate = conversionRate;
        burger = new Item("regular", "burger");
        drink = new Item("coke", "drink", 1.5);
        System.out.println(drink.name);
        side = new Item("fries", "side", 2.0);
    }

    private double getTotal() {
        double total = burger.price + drink.price + side.price;
        return Item.getPrice(total, conversionRate);
    }

    @Override
    public String toString() {
        return "%s%n%s%n%s%n%26s$%.2f".formatted(burger, drink, side,
                "Total Due: ", getTotal());
    }

    private class Item {
        private String name;
        private String type;
        private double price;

        public Item(String name, String type) {
            this(name, type, type.equals("burger") ? Meal.this.price : 0);
        }

        public Item(String name, String type, double price) {
            this.name = name;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return "%10s%15s $%.2f".formatted(type, name,
                    getPrice(price, conversionRate));
        }

        private static double getPrice(double price, double rate) {
            return price * rate;
        }
    }

    private class Burger extends Item {
        private List<Item> toppings = new ArrayList<>();

        public Burger(String name, double price) {
            super(name, "Burger", price);
        }

        public void addToppings(Item... newTopping) {
            Collections.addAll(toppings, newTopping);
        }

        @Override
        public String toString() {
            StringBuilder result = new StringBuilder(super.toString());
            for (Item topping : toppings) {
                result.append("\n Topping: ").append(topping.toString());
            }
            return result.toString();
        }

        public double calculateTotalPrice() {
            double total = super.price;
            for (Item topping : toppings) {
                total += topping.price;
            }
            return Item.getPrice(total, conversionRate);
        }
    }
}
