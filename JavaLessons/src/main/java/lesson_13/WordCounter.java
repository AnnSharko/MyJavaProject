package lesson_13;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        String[] words = {
                "Toyota", "BMW", "Toyota", "Honda", "Ford", "BMW",
                "Audi", "Mercedes", "Ford", "Tesla", "Toyota", "Volvo",
                "Audi", "Mazda", "Kia", "Kia", "Hyundai", "Tesla", "Mazda", "BMW"
        };

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Unique car brands:");
        for (String word : wordCount.keySet()) {
            System.out.println(word);
        }

        System.out.println("\nCar brand frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.printf("%s -> %d times%n", entry.getKey(), entry.getValue());
        }
    }
}
