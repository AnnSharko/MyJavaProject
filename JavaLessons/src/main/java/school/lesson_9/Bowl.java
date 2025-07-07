package school.lesson_9;

public class Bowl {
private int foodQuantity;
 public Bowl(int foodQuantity){
this.foodQuantity=foodQuantity;
 }
    public void addFood(int quantity) {
        if (quantity > 0) {
            foodQuantity += quantity;
        }
    }
    public boolean decreaseFood(int quantity) {
            if (foodQuantity >= quantity) {
                foodQuantity -= quantity;
                return true;
            } else {
                return false;
            }
        }
        public int getFoodQuantity() {
            return foodQuantity;
        }
    }