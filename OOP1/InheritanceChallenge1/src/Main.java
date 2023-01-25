public class Main {
    public static void main(String[] args){
        SalariedEmployee test = new SalariedEmployee("joao", "2003-05-25", "2022-11-17", 18000.00, true);
        test.terminateDate("2023-18-1");
        System.out.println(test);
    }
}
