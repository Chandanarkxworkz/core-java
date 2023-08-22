class Factorial1{
	public static void main(String factor [] ){
		System.out.println("main started");
	 getFact (5);
	 getFact (6);
	 getFact (12);
		System.out.println("main ended");
	 }
// Syntax

// methods
	public static void getFact(int factNumber){
		System.out.println("getFact started");
	int fact =1 ;
	for (int n =1; n<=factNumber ; n++){
		fact = fact * n;
	}
		System.out.println("the factorial of " + factNumber + " is " + fact );
		System.out.println("getFact ended");
	}
	}
	
	