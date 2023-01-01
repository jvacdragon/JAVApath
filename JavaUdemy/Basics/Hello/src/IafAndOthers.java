public class IafAndOthers {
    public static void main(String[] args) {
        int num = 4;
        //TERNARY OPERATOR
        boolean isTwo = num == 2 ? true : false;
        
        if(num%2 != 0 ){
            System.out.println("Number is odd " + isTwo);
        } else if (num%2==0 && num!=2) {
            System.out.println("Number is even and not 2 " + isTwo);
        }
    }
}
