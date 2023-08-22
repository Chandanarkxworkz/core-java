class EatClubExecutor1{

	public static void main (String food[]){
		System.out.println("main started");
		 double price= EatClub1.search("Biryani");
		System.out.println("the price for Biryani is " + price);
		
		double priceWithQuantity= EatClub1.search("Biryani",4);
		System.out.println("the price for Biryani with quantity 4 is " + priceWithQuantity);
		System.out.println("main ended");
		
		}
		}