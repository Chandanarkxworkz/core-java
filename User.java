class User{
	/*public User (){ //constr
	User user = new User(); //object created
	System.out.println(user);*/
	public void test(){
		test();
	}
	
	public static void main (String use[]){ //function called agin and again object func
	User user = new User();
	System.out.println(user);
	user.test();
	
	}
	}