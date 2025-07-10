package school.lesson10;
import java.util.ArrayList;
import java.util.List;
public class Box <T extends Fruit>{
    private List<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
}
