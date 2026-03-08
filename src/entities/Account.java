package entities;

import enums.AccountStatus;

public abstract class Account {

    protected long accountNumber;
    protected double balance;
    protected AccountStatus status;
    protected Customer owner;
    protected Transaction[] transactions;

    public Account(long accountNumber, double balance, Customer owner){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.status = AccountStatus.ACTIVE;
        this.owner = owner;
        this.transactions = new Transaction[5]; // Only records last 5 transcations.
    }

    public Account(long accountNumber, double balance, AccountStatus status,Customer owner){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.status = status;
        this.owner = owner;
        this.transactions = new Transaction[5]; // Only records last 5 transcations.
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Your deposit, amount : " + amount + " is successful");
            System.out.println("Your total balance : " + balance);
        }else {
            System.out.println("Invalid input");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }
}
