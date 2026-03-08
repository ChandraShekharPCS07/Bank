import entities.*;

void main() {

    System.out.println("Banking System Started");
    Bank bank = new Bank(1, "BOB", "Hyderbad");
    Branch branch = new Branch(101, "Mothi Nagar", "BOB101", "8-40 MotiNagar, Hyderabad");

    Customer customer = new Customer(1001, "Teju", "teju@gmail.com", "7013409936");
    Account account = new SavingsAccount(10001, 50000d, customer);

    account.withdraw(100);
}
