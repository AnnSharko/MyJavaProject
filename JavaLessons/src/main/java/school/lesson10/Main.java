package school.lesson10;

public class Main {

    public static void main(String[] args) {
        Orange orange = new Orange(1.5f);
        Apple apple = new Apple(1.0f);
        String[] fruits = new String[]{"Apple", "Orange"};

        swap(fruits, 0, 1);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }


        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(apple.getWeight()));
        appleBox.addFruit(new Apple(apple.getWeight()));
        Box<Apple> appleBox2 = new Box<>();

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(orange.getWeight()));
        orangeBox.addFruit(new Orange(orange.getWeight()));
        Box<Orange> orangeBox2 = new Box<>();

        boolean result = appleBox.compare(orangeBox);

        appleBox.transferFruitsTo(appleBox2);
        orangeBox.transferFruitsTo(orangeBox2);
    }

    public static void swap(String[] array, int a, int b) {
        String temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}