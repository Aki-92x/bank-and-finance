package presentationMonday;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    //constructor
    public SavingsAccount(String accountHolder, 
                            String accountNumber, 
                            double balance,
                            double interestRate) {

        //takes BankAccount constructor
        super(accountHolder, accountNumber, balance); //always remember that it must be in order 
        this.interestRate = interestRate;

    }

    //overiding abstrat method
    @Override
    public void applyMonthlyInterest() {
        double interest = getBalance() * interestRate;
        this.balance = this.balance + interest;
        System.out.println("Interest applied: $" + interest + ". New Balance: $" + getBalance());
    }
}
