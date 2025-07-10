package school.lesson10;

public class Main {

    public static void main(String[] args) {
        Orange orange = new Orange(1.5f);
        Apple apple = new Apple(1.0f);
        String[] fruits = new String[]{"Apple", "Orange"};

        swap(fruits, 0, 1);
    }

    public static void swap(String[] array, int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}