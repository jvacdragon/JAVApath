public class Main {
    public static void main(String[] args){

        Car newCar = new Car();
        newCar.setMake("Fiat");
        newCar.setModel("Punto");
        newCar.setColor("Red");
        newCar.setDoors(4);
        newCar.setConvertible(true);

        newCar.describeCar();

    }
}
