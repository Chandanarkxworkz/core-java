// class loasd all .class at static in java menory run time to permant gen/metaspace class info 
// java8 perment gen to metaspace
//object heap area
//method heap area  stack //compiler will give default value // i fwe go with the defa const all the instanc var will be loaded into thae object 
// refer varia will have adderess of the object  done by new keyword - hold the adrees withe the help of constryctor //bref var habving adress of objectn    Metro metro =new Metro();
// Metro metro =new Metro(1); //passing values at the time of object creation using const 
// constr -use intoial instan vari of class//parameterixed is better at the time of object creation only oncee
// default const will be 2 times  0 then 1
//int metroUId - default int variables // refern intial (reference intia)
public class Customer{
// encapsulation 
	private int customerId; //security resons 
	private String customerName; //encapsu achieved with the keyword called private
	private String address;
	private long contactNo;
	private	String gender;
	private	String dob;
	private	String email;
		// setter (intialize private instan varia) amd getter used to get the data back -methods
		
		
		public void setCustomerId(int customerId){ //method suffic uppercase
		this.customerId=customerId;
		}
		
		public void setCustomerName(String customerName){ //method suffic uppercase
		this.customerName=customerName;
		}
		
		public void setAddress(String address){ //method suffic uppercase
		this.address=address;
		}
		
		public void setContactNo(long contactNo){ //method suffic uppercase
		this.contactNo=contactNo;
		}
		
		public void setGender(String gender){ //method suffic uppercase
		this.gender=gender;
		}
		
		public void setDob(String dob){ //method suffic uppercase
		this.dob=dob;
		}
		
		public void setEmail(String email){ //method suffic uppercase
		this.email=email;
		}
		public int getCustomerId(){
		return customerId;
		}
		
		public String getCustomerName(){
		return customerName;
		}
		
		
		public String getAddress(){
		return address;
		}
		
		public long getContactNo(){
		return contactNo;
		}
		
		public String getGender(){
		return gender;
		}
		
		public String getDob(){
		return dob;
		}
		
		public String getEmail(){
		return email;
		}
		}
		
		
		
		
