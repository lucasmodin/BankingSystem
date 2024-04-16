import java.util.ArrayList;

public class account {

    private int accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;
    private double interestRate;
    private ArrayList<Transactions> transactionHistory;

public account(int accountNumber, String  accountHolderName, String accountType,
               double balance, double interestRate) {

    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.accountType = accountType;
    this.balance = balance;
    this.interestRate = interestRate;
    this.transactionHistory = new ArrayList<>();

}
//------------------------- Getters & Setters ----------------------------

    public ArrayList<Transactions> getTransactionHistory() {
        return transactionHistory;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setTransactionHistory(ArrayList<Transactions> transactionHistory) {
        this.transactionHistory = transactionHistory;
    }


//------------------------- Deposit & Withdrawal methods ----------------------------

    public void deposit(double amount) {
    balance += amount;

    }




}
