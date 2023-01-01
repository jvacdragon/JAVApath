public class Main {
    public static void main(String[] args) {
        int scoreOne = calculateScore(true, 10_000, 8, 200);
        int scoreTwo = calculateScore(true, 5000,10,150);

        int sum1 = sum(10, 15);
        int sum2 = sum(1,15,29);

        System.out.println(sum1);
        System.out.println(sum2);

        System.out.println("Your first score is: " + scoreOne + " and yor second score is: " + scoreTwo);

        double height = convertToCentimeters(2, 5);

        System.out.println(height);
    }

    //THIS IS A METHOD TO USE MORE THAN ONE TIME LIKE A FUNCTION
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }
        return finalScore;
    }

    //USING A METHOD THAT HAS A RETURN
    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    //METHODS CAN HAVE THE SAME NAME THEY ONLY NEED THE PARAMETERS TYPE OR THE NUMBER OF PARAMETERS TO BE DIFFERENT
    //THIS IS CALLED METHOD OVERLOADING
    public static int sum(int sum1, int sum2, int sum3){
        return sum1+sum2+sum3;
    }

    public static double convertToCentimeters(int inch){
        return inch*2.54;
    }

    public static double convertToCentimeters(int feet, int inch){
        return convertToCentimeters(feet*12 +inch);
    }
}
