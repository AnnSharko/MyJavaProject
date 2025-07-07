package school.lesson_9;

public class Main {
public static void main(String[] args){
    Bowl bowl=new Bowl(15);

    Cat[] cats= new Cat[]{
        new Cat("Bagira"),
        new Cat("Tom")
    };
    for (Cat cat : cats) {
        cat.eat(bowl);
        cat.showFullness();
    }
    for (Cat cat : cats) {
        cat.run(150);
        cat.swim(5);
    }
    Dog[] dogs = new Dog[] {
            new Dog("Rex"),
            new Dog("Pluto")
    };
    for (Dog dog : dogs) {
        dog.run(300);
        dog.swim(5);
    }
    bowl.addFood(30);
    for (Cat cat : cats) {
        if (!cat.isFull()) {
            cat.eat(bowl);
        }}
    Payment payment = new Payment();

    payment.addItem("Item_1", 2, 5.0);
    payment.addItem("Item_2", 3, 10.0);
    payment.addItem("Item_3", 4, 15.5);
    Park park = new Park();
park.addAttraction("Roller Coaster 1", "10:00 - 20:00", 7.0);
park.addAttraction("Roller Coaster 2", "11:00 - 21:00", 10.0);

park.showAttractions();
}
}