class SwiggyExecutor2{

	public static void main (String food[]){
		
		System.out.println("main started");
		
		double price= Swiggy2.search("pizza");
		System.out.println("the price for pizza is " +price);
		double priceWithQuantity= Swiggy2.search("pizza",4);
		System.out.println("the price for pizza with quantity is " +priceWithQuantity);
		
		System.out.println("main ended");
		
		}
		}
		