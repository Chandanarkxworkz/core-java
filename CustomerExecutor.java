class CustomerExecutor{
	public static void main(String cust[]){
	Customer customer = new Customer();
	//invoking the setter in customerid variable
	customer.setCustomerId(1);
	System.out.println("the customer id is " + customer.getCustomerId());
	
	customer.setCustomerName("chandu");
	System.out.println("the customer name is " + customer.getCustomerName());
	

	customer.setAddress("hoysala badavane");
	System.out.println("the customer address is " + customer.getAddress());
	
	
	customer.setContactNo(808851);
	System.out.println("the customer contact number is " + customer.getContactNo());
	
	
	customer.setGender("female");
	System.out.println("the customer gender is " + customer.getGender());
	
	
	customer.setDob("27-02-2001");
	System.out.println("the customer dob is " + customer.getDob());
	
	
	customer.setEmail("chandanark2001@gmail.com");
	System.out.println("the customer email is " + customer.getEmail());
	
	}
}
