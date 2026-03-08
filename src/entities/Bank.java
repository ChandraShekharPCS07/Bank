package entities;

public class Bank {

    private int bankId;
    private String bankName;
    private String headquarters;
    private Branch[] branches;

    public Bank(int bankId, String bankName, String headquarters){
        this.bankId = bankId;
        this.bankName = bankName;
        this.headquarters = headquarters;
        this.branches = new Branch[5];
    }

    public void addBranch(Branch branch){
        branches[0] = branch;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
    }

    public Branch[] getBranches() {
        return branches;
    }

    public void setBranches(Branch[] branches) {
        this.branches = branches;
    }
}
