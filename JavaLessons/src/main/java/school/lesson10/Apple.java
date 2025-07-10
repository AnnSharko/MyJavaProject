package school.lesson10;

import javax.swing.*;

public class Apple extends Fruit{
public Apple(float weight){
    super (weight);
}
    @Override
    public float getWeight() {
        return weight;
    }
}
