package entities;

public class Customer {

    private int customerId;
    private String name;
    private String email;
    private String phoneNumber;
    private Account account;

    public Customer(int customerId, String name, String email, String phoneNumber){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void addAccount(Account account){
        this.account = account;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccounts(Account account) {
        this.account = account;
    }
}