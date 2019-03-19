package Lab9.Prob9;
import java.util.*;

public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public static boolean vegetarianMealAvailable(){
        return menu.stream().anyMatch(Dish::isVegetarian);
    }

    public static boolean anyHealthyMenu(){
        return menu.stream().anyMatch(m -> m.getCalories() < 1000);
    }

    public static boolean anyUnHealthyMenu(){
        return menu.stream().anyMatch(m -> m.getCalories() > 1000);
    }

    public static Optional<Dish> firstDish(){
        return menu.stream().filter(m -> m.type == Type.MEAT).findFirst();
    }

    public static int calculateTotalCalories(){
        return menu.stream().map(m -> m.getCalories()).reduce(0, (x, y) -> x + y);
    }

    public static int calculateTotalCaloriesMethodReference(){
        return menu.stream().map(Dish::getCalories).reduce(0, Math::addExact);
    }

    public static void main(String[] args) {
        System.out.println("Any Vegetarian Meals? " + vegetarianMealAvailable());
        System.out.println("Any Healthy Menu? " + anyHealthyMenu());
        System.out.println("Any UnHealthy Menu? " + anyUnHealthyMenu());
        System.out.println("The first Dish " + firstDish().orElse(new Dish("N/A", false, 0, Type.OTHER)));
        System.out.println("Total Calories " + calculateTotalCalories());
        System.out.println("Total Calories using method Reference " + calculateTotalCaloriesMethodReference());
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    public enum Type { MEAT, FISH, OTHER }

    @Override
    public String toString() {
        return name;
    }

    public static final List<Dish> menu =
            Arrays.asList( new Dish("pork", false, 800, Type.MEAT),
                           new Dish("beef", false, 700, Type.MEAT),
                           new Dish("chicken", false, 400, Type.MEAT),
                           new Dish("french fries", true, 530, Type.OTHER),
                           new Dish("rice", true, 350, Type.OTHER),
                           new Dish("season fruit", true, 120, Type.OTHER),
                           new Dish("pizza", true, 550, Type.OTHER),
                           new Dish("prawns", false, 400, Type.FISH),
                           new Dish("salmon", false, 450, Type.FISH));
}