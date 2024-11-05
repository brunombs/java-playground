import java.util.ArrayList;
import java.util.List;

public class MealOrder {
    private final List<Food> foodItems = new ArrayList<>();
    private final List<Beverage> beverageItems = new ArrayList<>();

    public void addFood(Food food) {
        foodItems.add(food);
    }

    public void addBeverage(Beverage beverage) {
        beverageItems.add(beverage);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Food food : foodItems) {
            total += food.getPrice();
        }
        for (Beverage beverage : beverageItems) {
            total += beverage.getPrice();
        }
        return total;
    }

    public int calculateTotalCalories() {
        int total = 0;
        for (Food food : foodItems) {
            total += food.getCalories();
        }
        return total;
    }

    public int calculateTotalML() {
        int total = 0;
        for (Beverage beverage : beverageItems) {
            total += beverage.getMl();
        }

        return total;
    }

    public List<Beverage> getBeverageItems() {
        return beverageItems;
    }

    public List<Food> getFoodItems() {
        return foodItems;
    }
}
