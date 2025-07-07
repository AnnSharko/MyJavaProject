package school.lesson_9;

import school.lesson_9.AnimalClass;
import school.lesson_9.Bowl;

public class Cat extends AnimalClass{

 private static final int RUN_LIMIT = 200;
 private boolean fullness = false;
 private static final int FOOD_NEED = 10;
 public boolean isFull() {
  return fullness;
 }
 public Cat(String name) {

  super(name);
 }
 public void eat(Bowl bowl) {
  if (bowl.decreaseFood(FOOD_NEED)) {
   fullness = true;
   System.out.println(name + " is not hungry.");
  } else {
   fullness = false;
   System.out.println(name + " is hungry.");
  }
 }
 public void showFullness() {
  System.out.println(name + " fullness: " + fullness);
 }
 @Override
 public void run(int distance) {
  if (distance <= RUN_LIMIT) {
   System.out.println(name + " ran " + distance + " meters.");
  } else {
   System.out.println(name + " can not run " + distance + " meters. Limit is " + RUN_LIMIT + " meters.");
  }
 }

 @Override
 public void swim(int distance) {
  System.out.println(name + " can not swim.");
 }
}
