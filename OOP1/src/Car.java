public class Car{
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;


    public String getMake() {
        return make.toUpperCase();
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
        if(make == null) make = "Unknown";
        this.make = make.toUpperCase();
    }

    public void setModel(String model) {
        if(model==null) model = "Unkown";
        this.model = model.toUpperCase();
    }

    public void setColor(String color) {
        if(color == null) color = "Unknow";
        this.color = color.toUpperCase();
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println("Car make: "+make+
                        "; model: "+model+
                "; color: "+ color+
                "; doors: "+doors+
                "; convertible: "+convertible);
    }
}
