class ChanduTextilesExecutor{
	public static void main(String chandu[]){
		String [] brands = {"puma","adidas","arrow","Zara","levis"};
		String [] brandsForDifferentLocation = {"max","pool","viky"};
		ChanduTextiles textiles = new ChanduTextiles(1,"chandu",50,brands,brandsForDifferentLocation,"Chikpete");
		
		textiles.doBusiness();
		System.out.println(textiles.id + " " +textiles.name + " " + textiles.noOfWorkers+" " + textiles.location);
		System.out.println("the list of brands available are : " );
		textiles.getAllBrands(textiles.brands);
		
		ChanduTextiles textiles1 = new ChanduTextiles(2,"smile",10,brands,brandsForDifferentLocation,"KR Puram");
		
		textiles.doBusiness();
		System.out.println(textiles1.id + " " +textiles1.name + " " + textiles1.noOfWorkers+" " + textiles1.location);
		System.out.println("the list of brands available are : " );
		textiles.getAllBrands(textiles1.brandsForDifferentLocation);
		
		
		
	}
}