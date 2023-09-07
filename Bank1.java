public class Bank1 {
    // Instance variables
    private String name;
    private String location;
    private String branchCode;
    private double balance;
    private int numberOfCustomers;

   
	// Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumberOfCustomers(int numberOfCustomers) {
        this.numberOfCustomers = numberOfCustomers;
    }
	
    // Getter methods
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }
}

    

    