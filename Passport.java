class Passport{
String passportOffice;
String email;
String givenName;
String surName;
String dob;
String password;
String confirmPassword;
// intializ instanance variables
		public Passport(){
			System.out.println("the constructor are called and the object is created");// construct with no parameter - default constr // overloading method overloading constructor overloading
		}

	public boolean verifyPassword(String password,String confirmPassword){
	System.out.println("inside verifyPassword");
	boolean isPasswordVerified = false;
	System.out.println(password.length());
	if ((password.length()>=8 && confirmPassword.length()>=8)&& ((password.length()<=16 && confirmPassword.length()<=16))){}
	// validate the length of password
	if(password==confirmPassword){
	System.out.println("password is verified... the given user details are: ");
	isPasswordVerified= true;
	displayUserDetails();
	} 
	else{
	System.out.println("you have entered wrong password please try again");
	}
	return isPasswordVerified;
	}
	public void displayUserDetails(){
	System.out.println("the passport office is " +passportOffice);
	System.out.println("the given name is " +givenName);
	System.out.println("the sur name provided  is " +surName);
	System.out.println("the given data of birth is " +dob);
	System.out.println("the password  is " +password);
	System.out.println("the given email id is " +email);
	System.out.println("the  confirm password  is " +confirmPassword);
	}
}