public static void main(String[] args) {
    Food hamburger = new Food("Hamburger", 300, 8.50);
    Food pizza = new Food("Pizza", 250, 10.00);
    Food salad = new Food("Salad", 150, 6.00);
    Beverage cola = new Beverage("Coca-Cola", 350, 2.00);
    Beverage orangeJuice = new Beverage("Orange Juice", 420, 3.50);
    Beverage water = new Beverage("Water", 500, 1.00);

    MealOrder[] mealOrders = new MealOrder[10];

    for (int i = 0; i < mealOrders.length; i++) {
        mealOrders[i] = new MealOrder();

        if (i % 3 == 0) {
            mealOrders[i].addFood(hamburger);
            mealOrders[i].addBeverage(cola);
        } else if (i % 3 == 1) {
            mealOrders[i].addFood(pizza);
            mealOrders[i].addBeverage(orangeJuice);
        } else {
            mealOrders[i].addFood(salad);
            mealOrders[i].addBeverage(water);
        }

        System.out.println("Meal Order " + (i + 1) + ":");
        System.out.println("Contains: " + mealOrders[i].getFoodItems().get(0).getName() +
                " and " + mealOrders[i].getBeverageItems().get(0).getName());
        System.out.println("Total Price: " + mealOrders[i].calculateTotalPrice());
        System.out.println("Total Calories: " + mealOrders[i].calculateTotalCalories());

        if (!mealOrders[i].getBeverageItems().isEmpty()) {
            for (Beverage beverage : mealOrders[i].getBeverageItems()) {
                System.out.println("Beverage Volume: " + beverage.getMl() + " ml");
            }
        }
        System.out.println();
    }
}