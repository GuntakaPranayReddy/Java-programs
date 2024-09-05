import java.util.*;
/*class account{
    private int id=0;
    private double balance=0;
    private double annual_interest_rate=0;
    private java.util.Date dateCreated; // java.util.Date obj1; to know the date


    public account() {
        dateCreated = new java.util.Date(); // we wsill get the date.
    }
    account(int id, double balance)
    {
        this.id=id;
        this.balance=balance;
    
    }
    int id()
    {
        return id;
    }
    
} */
class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private java.util.Date dateCreated;
    
    public Account() {
    dateCreated = new java.util.Date();
    }
    public Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
    dateCreated = new java.util.Date();
    }
    public int getId() {
    return this.id;
    }
    public double getBalance() {
    return balance;
    }
    public static double getAnnualInterestRate() {
    return annualInterestRate;
    }
    public void setId(int newId) {
    id = newId;
    }
    public void setBalance(double newBalance) {
    balance = newBalance;
    }
    public static void setAnnualInterestRate(double newAnnualInterestRate) {
    annualInterestRate = newAnnualInterestRate;
    }
    public double getMonthlyInterest() {
    return balance * (annualInterestRate / 1200);
    }
    public java.util.Date getDateCreated() {
    return dateCreated;
    }
    public void withdraw(double amount) {
    balance -= amount;
    }
    public void deposit(double amount) {
    balance += amount;
    }
    }
    public class account_calc {
            public static void main (String[] args) {
            Account account = new Account(1122, 20000);
            Account.setAnnualInterestRate(4.5);
            account.withdraw(2500);
            account.deposit(3000);
            System.out.println("Balance is " + account.getBalance());
            System.out.println("Monthly interest is " +
            account.getMonthlyInterest());
            System.out.println("This account was created at " +
            account.getDateCreated());
        }
    }
    
        