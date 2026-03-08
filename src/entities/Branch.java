package entities;

public class Branch {

    private int branchId;
    private String branchName;
    private String ifscCode;
    private String address;
    private Customer[] customers;

    public Branch(int branchId, String branchName, String ifscCode, String address){
        this.branchId = branchId;
        this.branchName = branchName;
        this.ifscCode = ifscCode;
        this.address = address;
        this.customers = new Customer[10];
    }

    public void addCustomer(Customer customer){
        customers[0] = customer;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
}
