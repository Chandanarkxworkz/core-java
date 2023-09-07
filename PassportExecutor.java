class PassportExecutor 
{

	public static void main(String pass[]){
	Passport passport = new Passport();
	passport.passportOffice="banglore";
	passport.email= "chandanark2001@gmail.com";
	passport.givenName="Chandana";
	passport.surName="R K";
	passport.dob="27-02-2001";
	passport.password="chandu234";
	passport.confirmPassword="chandu234";
	
	passport.verifyPassword(passport.password ,passport.confirmPassword);
	
	System.out.println("**************************************************");
	
	Passport passport1 = new Passport();
	passport1.passportOffice="manglore";
	passport1.email= "pavanrk@gmail.com";
	passport1.givenName="pavan";
	passport1.surName="R K";
	passport1.dob="14-01-2004";
	passport1.password="pavan1234567";
	passport1.confirmPassword="pavan1234567";
	
	passport1.verifyPassword(passport1.password ,passport1.confirmPassword);
	
	System.out.println("**************************************************");
	
	
	Passport passport2 = new Passport();
	passport2.passportOffice="pune";
	passport2.email= "ranju2001@gmail.com";
	passport2.givenName="ranju";
	passport2.surName="PSR";
	passport2.dob="28-04-2000";
	passport2.password="ranju";
	passport2.confirmPassword="ranju";
	
	passport2.verifyPassword(passport2.password ,passport2.confirmPassword);
	
	System.out.println("**************************************************");
	
	Passport passport3 = new Passport();
	passport3.passportOffice="tamilnadu";
	passport3.email= "saniya2001@gmail.com";
	passport3.givenName="saniya";
	passport3.surName="sainab";
	passport3.dob="25-09-2001";
	passport3.password="saniya$999911111111111111111111111111111111111";
	passport3.confirmPassword="saniya$99991111111111111111111111111111";
	
	passport3.verifyPassword(passport3.password ,passport3.confirmPassword);
	
	System.out.println("**************************************************");
	
	Passport passport4 = new Passport();
	passport4.passportOffice="chennai";
	passport4.email= "chinmayi2001@gmail.com";
	passport4.givenName="Chinmayi";
	passport4.surName="S";
	passport4.dob="15-03-2001";
	passport4.password="chinmayi222";
	passport4.confirmPassword="chinmayi222";
	
	passport4.verifyPassword(passport4.password ,passport4.confirmPassword);
	
	System.out.println("**************************************************");
	
	Passport passport5 = new Passport();
	passport5.passportOffice="hydrabad";
	passport5.email= "dhanya2001@gmail.com";
	passport5.givenName="dhanya";
	passport5.surName="narayan";
	passport5.dob="19-11-2001";
	passport5.password="dhanya777";
	passport5.confirmPassword="pavan234";
	
	passport5.verifyPassword(passport5.password ,passport5.confirmPassword);
	
	System.out.println("**************************************************");
	
	
	
	}
	}