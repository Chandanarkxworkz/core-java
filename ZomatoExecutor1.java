class ZomatoExecutor1{

	public static void main (String food[]){
		System.out.println("main started");
		
		double price= Zomato1.search("Chicken Tikka");
		System.out.println("the price for Chicken Tikka is " + price);
		double priceWithQuantity= Zomato1.search("Chicken Tikka",6);
		System.out.println("the price for Chicken Tikka with quantity is " + priceWithQuantity);

		System.out.println("main ended");
		
		}
		}