public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal(
                new Hamburger("CheeseBurger"),
                new Drink("Soda", "Medium"),
                new SideItem("Nuggets"));

        System.out.println(meal.toString());

        System.out.println(meal.totalPrice());

        meal.drink.changeSize("Small");
        System.out.println(meal.totalPrice());

    }
}
