public class PersonalComputer extends Product{
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public PersonalComputer(
              String model
            , String manufacturer
            , int width
            , int height
            , int depth
            , ComputerCase computerCase
            , Monitor monitor
            , Motherboard motherboard
    ){

        super(model, manufacturer, width, height, depth);

        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "computerCase=" + computerCase +
                ", monitor=" + monitor +
                ", motherboard=" + motherboard +
                "} " + super.toString();
    }
}
