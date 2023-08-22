class UberEatsExecutor1{

	public static void main (String food[]){
		System.out.println("main started");
		double price= UberEats1.search("Hyderabad biryani");
		System.out.println("the price for Hyderabad biryani is " + price);
		double priceWithQuantity= UberEats1.search("Hyderabad biryani",5);
		System.out.println("the price for Hyderabad biryani with quantity is " + priceWithQuantity);
		System.out.println("main started");
		}
		}
		