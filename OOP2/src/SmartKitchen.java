public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void setKitchenWork(boolean coffeeFlag,
                              boolean fridgeFlag,
                              boolean dishWasherFlag){

        getIceBox().setHasWorkToDo(fridgeFlag);
        getBrewMaster().setHasWorkToDo(coffeeFlag);
        getDishWasher().setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        getIceBox().orderFood();
        getDishWasher().doDishes();
        getBrewMaster().brewCoffee();
    }
}

class Refrigerator{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo) {
            System.out.println("Ordering food");
            this.hasWorkToDo = false;
        }
    }
}

class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo) {
            System.out.println("Washing Dishes");
            this.hasWorkToDo = false;
        }

    }
}

class CoffeeMaker{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
        if(hasWorkToDo) {
            System.out.println("Brewing coffee");
            this.hasWorkToDo = false;
        }
    }
}