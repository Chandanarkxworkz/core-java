class BankExecutor{
	 public static void main(String[] ban) {
        // Create a new Bank object
        Bank1 bank = new Bank1();

        // Get and print bank information
		bank.setName("MyBank");
        System.out.println("Bank Name: " + bank.getName());
		bank.setLocation("new york");
        System.out.println("Bank Location: " + bank.getLocation());
		bank.setBranchCode("1000000.0");
        System.out.println("Branch Code: " + bank.getBranchCode());
		 bank.setBalance(5000);
        System.out.println("Bank Balance: $" + bank.getBalance());
		bank.setNumberOfCustomers(5500);
		System.out.println("Number of Customers: " + bank.getNumberOfCustomers());
	 }
}

