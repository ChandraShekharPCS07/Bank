package entities;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(long accountNumber, double balance, Customer owner) {
        super(accountNumber, balance, owner);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Your withdraw amount : " + amount + " is successful");
            System.out.println("Your total balance available : " + balance);
        }else {
            System.out.println("Amount exceeded");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
