package school.lesson_9;

public abstract class AnimalClass {
 protected String name;
 protected static int animalCount;
public AnimalClass (String name) {
    this.name= name;
    animalCount++;
}
public abstract void swim(int distance);
public abstract void run(int distance);
}

