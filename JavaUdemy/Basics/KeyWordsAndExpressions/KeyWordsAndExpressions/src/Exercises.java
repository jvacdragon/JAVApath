public class Exercises {
    public static void main(String[] args){
        //checkNumber(0);

//        long miles = toMilesPerHour(75.114);
//        System.out.println(miles);

        //printConversion(1.5);
    }
    public static void checkNumber(int number){
        if(number > 0) {
            System.out.println("positive");
        } else if(number < 0){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    //1 MILE/H = 1.609KM/H
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour < 0) return -1;

        double milesPerHour = kilometersPerHour/1.609;
        return (long) Math.round(milesPerHour);
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
        }
    }
}
