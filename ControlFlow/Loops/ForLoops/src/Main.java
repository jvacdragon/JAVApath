public class Main {
    public static void main(String [] args){
        System.out.println(countPrimes(50));


        for(double i = 7.5; i<=10; i = i+0.25){
            //System.out.println("counter is in " + counter);

           double amount = calculateInterest(100, i);
           if (amount == 8.5) {
               break;
           }// BREAK THE LOOP IF THE CONDITION IS TRUE

            System.out.println(amount);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
      return (amount * (interestRate/100));
    }

    public static boolean isPrime(int number){
        if(number <= 0){
            return false;
        }

        if(number == 1 || number == 2){
            return true;
        }

        for (int i = 2; i < number; i++){

            int rests = number%i;

            if(rests == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrimes(int number){

        int primes = 0;
        for(int i = 1; i <= number; i++){
            if(isPrime(i)){
                primes++;
            }
        }
        return primes;
    }

//    public static void forContinue() {
//        for (int i = 1; i <=10; i++){
//            if(i==5){
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
}
