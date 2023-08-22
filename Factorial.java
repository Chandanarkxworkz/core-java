class Factorial {
// 5! = 1*2*3*4*5
// 0! = 1
	public static void main (String factorial []){
	
		int factNumber = 5;
		int dummy = 1;
	for (int fact = 1; fact <= factNumber;fact++ ){
		dummy = dummy * fact ;
	}
		System.out.println("the factorial of number is  " + factNumber + " is " + dummy);
		
		
	}
	}
	// methods always outside main // methods - method starts with lower case with parameters    code reusability advant 
	// <access-modifier> return type methodname (parameter,1 2 3){
		// public static (access) void - return 
		// parantisis always used with methodname // writ onces use it mulripl number of times // purpose 
		// method is a block of codwe used to perform certion function