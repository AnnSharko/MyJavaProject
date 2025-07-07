package school.lesson_9;

import java.util.ArrayList;
import java.util.List;

public class Payment {

    private List<Item> items = new ArrayList<>();
    public class Item {
        private String name;
        private int quantity;
        private double pricePerUnit;

        public Item(String name, int quantity, double pricePerUnit) {
            this.name = name;
            this.quantity = quantity;
            this.pricePerUnit = pricePerUnit;
        }

        public double getTotalPrice() {
            return quantity * pricePerUnit;
        }

        public String getInfo() {
            return name + ": Price " + getTotalPrice();
        }

        public double getTotalSum() {
            double sum = 0;
            for (Item item : items) {
                sum += item.getTotalPrice();
            }
            return sum;
        }
    }
        public void addItem(String name, int quantity, double pricePerUnit) {
            Item item = new Item(name, quantity, pricePerUnit);
            items.add(item);
        }
    public void showTotalSum() {
        double totalSum = 0;
        for (Item item : items) {
            totalSum += item.getTotalPrice();
        }
        System.out.println("Total sum: " + totalSum);
    }
}