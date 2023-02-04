public class Main {
    public static void main(String[] args){

        Monitor hoopson = new Monitor("s23", "Hoopson", 50,
                60,
                5,
                25,
                "1044p"
        );

        ComputerCase computerCase = new ComputerCase(
                "someMoldel"
                , "hoopson"
                , 220
                , 123
                , 123
                , "500"
        );
        Motherboard motherboard = new Motherboard("otherModel",
                "hoopson",
                123,
                123,
                123,
                8,
                8, "someBios");

        PersonalComputer personalComputer = new PersonalComputer(
                "computerModel",
                "marcaQualquer",
                123,
                123,
                123,
                computerCase,
                hoopson,
                motherboard
        );
        System.out.println(personalComputer.toString());

        personalComputer.getMonitor().drawPixelAt(1,2,"red");
    }
}
