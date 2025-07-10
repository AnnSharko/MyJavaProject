package school.lesson10;
import java.util.ArrayList;
import java.util.List;
public class Box <T extends Fruit> {
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public List<T> getFruits() {
        return fruits;
    }
public float getWeight() {
    float weight = 0.0f;

    for (int i = 0; i < fruits.size(); i++) {
        T fruit = fruits.get(i);
        weight += fruit.getWeight();
    }

    return weight;
}
    public boolean compare(Box<?> otherBox) {
        return this.getWeight() == otherBox.getWeight();
    }
    public void transferFruitsTo(Box<T> otherBox) {
        otherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}