package presentationMonday;

public abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    protected double balance;

    //constructor
    public BankAccount(String accountHolder, 
                        String accountNumber, 
                        double balance) {

        //giving method data to fields
        this.accountNumber = accountNumber; 
        this.accountHolder = accountHolder;  
        this.balance = balance;   

        }

        //getters
        public String getAccountNumber() { return accountNumber; }
        public String getAccountHolder() { return accountHolder; }
        public double getBalance() { return balance; }

        //setters
        public void setBalance(double balance) {

            if (balance < 0) {
                System.out.println("Inputted balance cannot be negative");
            } else {
                this.balance = balance;
            }
            
        }

        //let child overide it
        public abstract void applyMonthlyInterest();

        //method (infos)
        void displayInfo() {
            System.out.println("");
            
            System.out.println("Account Holder: " + getAccountHolder());
            System.out.println("Starting Balance: $" + getBalance());
        } 
    
}