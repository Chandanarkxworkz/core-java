class FaceBook{
	public static void main(String face[]){
		login("chandanark2001@gmail.com","chandu@777");
		login(8088519052L,"chandu@123");
	}
	public static void login(String email, String password){
		System.out.println("invoked search : email(String),password(String)");
		System.out.println("please login with the email and password");
		System.out.println("end of search");
	}
	public static void login(long phoneNumber, String password){
		System.out.println("invoked search : phoneNumber(long),password(String)");
		System.out.println("please login with the phone number and password");
		System.out.println("end of search");
}
}