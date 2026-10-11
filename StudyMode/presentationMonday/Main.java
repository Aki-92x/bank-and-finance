package presentationMonday;

import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);


    static void print(String text, boolean newLine) { 
        if (newLine) { System.out.println(text); } 
        else { System.out.print(text); }
    }

    static String userInputString(String text, String error) {
        
        String inputedInformation ;
        boolean isDone = false;


        do {

            print(text, false);
            inputedInformation = s.nextLine();

            if(inputedInformation.equals("")) {
                print(error, true);
            
            } else { isDone = true; }

        } while (!isDone);

        return inputedInformation;
    }

    static int userInputDouble(String text, String error) {
        
        int inputedInformation = 0;
        boolean isDone = false;


        do {
            try {
                print(text, false);
                inputedInformation = s.nextInt();

                if (inputedInformation < 0) {
                    print(error, true);
                } else { isDone = true; }
                
            } catch (java.util.InputMismatchException e) { 
                s.nextLine(); //removes scanner bug so it wont infinite loop
                print("Please input Number only", true);
            }

        } while (!isDone);    
        return inputedInformation;
    }

    public static void main(String[] args) {
        String accountHolderName = 
        userInputString("Input Account Holder Name: ", 
                            "Name must not be blank");
        
        String accountNumber = userInputString("Input Account Number: ", 
                                                "Account number must not be blank");

        double accountBalance = userInputDouble("Input Account Balance: ", 
                                                "Must be a number");
        
        double interestRate = userInputDouble("Input Interest Rate: ", 
                                                "Must be a number");


        SavingsAccount myAccount = new SavingsAccount(accountHolderName, 
                                                        accountNumber, 
                                                        accountBalance, 
                                                        interestRate);
                                                        
        myAccount.displayInfo();
        myAccount.applyMonthlyInterest();

    }
}
