public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String accountCustomer;
    private String userEmail;
    private int userPhoneNumber;

    public BankAccount(){
        //CALLING A CONSTRUCTOR INSIDE OTHER CONSTRUCTOR
        this(
                123,
                00,
                "Default name",
                "Default Email",
                12313
        );
    }

    public BankAccount(int accountNumber, double accountBalance, String accountCustomer,String userEmail, int userPhoneNumber){
        this.accountBalance = accountBalance;
        this.accountCustomer = accountCustomer;
        this.accountNumber =accountNumber;
        this.userEmail = userEmail;
        this.userPhoneNumber = userPhoneNumber;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance(){
        return accountBalance;
    }

    public String getAccountCustomer(){
        return accountCustomer;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public int getUserPhoneNumber(){
        return userPhoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountCustomer(String accountCustomer) {
        this.accountCustomer = accountCustomer;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPhoneNumber(int userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    private boolean checkWithdraw(double value){
        if((this.accountBalance - value) >= 0){
            return true;
        }
        return false;
    }
    public void withdraw(double value){
            boolean doWithdraw = checkWithdraw(value);

            if (doWithdraw) {
                double newBalanceAccount = this.accountBalance - value;

                this.setAccountBalance(newBalanceAccount);
                System.out.println("Your actual balance is " + this.accountBalance);
            } else{
                System.out.println("You're poor. Please get more money to pay for this");
            }
    }
    public void deposit(double value){
        double newBalanceAccount = this.accountBalance + value;

        this.setAccountBalance(newBalanceAccount);
        System.out.println("Your actual balance is " + this.accountBalance);
    }
}
