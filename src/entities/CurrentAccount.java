package entities;

import enums.AccountStatus;

public class CurrentAccount extends Account {

    private double overdraftLimit;

    public CurrentAccount(long accountNumber, double balance, AccountStatus status, Customer owner) {
        super(accountNumber, balance, status, owner);
    }

    @Override
    public void withdraw(double amount) {
        if ((balance + overdraftLimit) > amount){
            balance -= amount;
            System.out.println("Withdraw Successful : " + amount);
        }else{
            System.out.println("Amount exceeded");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
