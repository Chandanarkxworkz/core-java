class EatSureExecutor1{

	public static void main (String food[]){
		System.out.println("main started");
		
		double price= EatSure1.search("malabar parotta");
		System.out.println("the price for malabar parotta is " + price);
		double priceWithQuantity= EatSure1.search("malabar parotta",3);
		System.out.println("the price for malabar parotta with quantity is " + priceWithQuantity);
		
		System.out.println("main ended");
		
		}
		}