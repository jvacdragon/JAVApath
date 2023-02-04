public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer, int width, int height, int depth){
        this.depth = depth;
        this.manufacturer = manufacturer;
        this.model = model;
        this.width = width;
        this.height = height;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;
    Monitor(String model, String manufacturer, int width, int height, int depth, int size, String resolution){
        super(model,manufacturer,width,height, depth);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.printf("Drawing Pixel at (%d, %d) in color %s", x,y,color);
    }
}

class Motherboard extends Product{
    private int ramSlots;
    private int cardSlots;
    private String bios;
    Motherboard(String model, String manufacturer, int width, int height, int depth,
                int ramSlots, int cardSlots, String bios){
        super(model,manufacturer,width,height, depth);
        this.cardSlots = cardSlots;
        this.ramSlots = ramSlots;
        this.bios = bios;
    }


    public void loadProgram(String programName){
        System.out.println("Program: " + programName + " is loading...");
    }
}

class ComputerCase extends Product{
    private String powerSupply;
    ComputerCase(String model, String manufacturer, int width, int height, int depth
    , String powerSupply){
        super(model,manufacturer,width,height, depth);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButtorn(){
        System.out.println("Power button pressed");
    }
}
