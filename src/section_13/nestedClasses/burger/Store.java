package section_13.nestedClasses.burger;

public class Store {
    public static void main(String[] args) {
        MealLecture regularMeal = new MealLecture();
        regularMeal.addToppings("Ketchup", "Mayo", "Bacon", "Cheddar");
        System.out.println(regularMeal);

        Meal USRegularMeal = new Meal(0.68);
        System.out.println(USRegularMeal);
    }
}
