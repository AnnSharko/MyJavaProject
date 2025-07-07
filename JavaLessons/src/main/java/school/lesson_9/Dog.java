package school.lesson_9;

public class Dog extends AnimalClass {

 private static final int RUN_LIMIT = 500;
 private static final int SWIM_LIMIT = 10;

 public Dog(String name) {
  super(name);
 }

 @Override
 public void run(int distance) {
  if (distance <= RUN_LIMIT) {
   System.out.println(name + " ran " + distance + " meters.");
  } else {
   System.out.println(name + " cannot run " + distance + " meters. Run limit is " + RUN_LIMIT + " meters.");
  }
 }

 @Override
 public void swim(int distance) {
  if (distance <= SWIM_LIMIT) {
   System.out.println(name + " swam " + distance + " meters.");
  } else {
   System.out.println(name + " cannot swim " + distance + " meters. Swim limit is " + SWIM_LIMIT + " meters.");
  }
 }
}



