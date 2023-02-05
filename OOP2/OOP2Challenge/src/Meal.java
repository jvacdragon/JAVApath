public class Meal {
    final Hamburger hamburger;
    final Drink drink;
    final SideItem sideItem;

    public Meal(){
        this(new Hamburger("burger"), new Drink("Coke", "Small"), new SideItem("Fries"));
    }

    @Override
    public String toString() {
        return "Meal{" +
                "\n hamburger=" + hamburger +
                ",\n drink=" + drink +
                ",\n sideItem=" + sideItem +
                '}';
    }

    public Meal(Hamburger hamburger, Drink drink, SideItem sideItem){
        this.hamburger = hamburger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public double totalPrice(){
        return hamburger.getPrice()+ drink.getPrice()+ sideItem.getPrice();
    }

}

class Hamburger{
    final String type;
    final double price;

    public Hamburger(){
        this("Burger");
    }
    public Hamburger(String type){
        this.type = type;
        price = 15.00;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}

class Drink{
    final String type;
    private String size;
    private double price;

    public Drink(){
        this("Coke", "Small");
        drinkPrice();
    }
    public Drink(String type, String size){
        this.type = type;
        this.size = size;
        drinkPrice();
    }

    private void drinkPrice(){
        switch (size){
            case "Small" -> price = 6.00;
            case "Medium" -> price = 10.00;
            default -> price = 13.00;
        }
    }

    public void changeSize(String newSize){
        size = newSize;
        drinkPrice();
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}

class SideItem{
    final String type;
    final double price;

    public SideItem(){
        this("Fries");
    }
    public SideItem(String type){
        this.type = type;
        price = 5.00;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}