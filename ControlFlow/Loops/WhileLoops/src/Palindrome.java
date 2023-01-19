public class Palindrome {
    public static boolean isPalindrome(int number){
        int firstNumber = number;
        String newNumber = "";

        do{
            int lastDigit = number%10;
            newNumber+=lastDigit;
            number=number/10;
        } while(number != 0);
        if(Integer.parseInt(newNumber) == firstNumber){
            return true;
        }
        return false;
    }
}
