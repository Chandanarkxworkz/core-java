class ChanduTextiles{

	int id ;
	String name;
	int noOfWorkers;
	String[] brands ={"puma","adidas","arrow","Zara","levis"};
	String[] brandsForDifferentLocation= {"max","pool","viky"};
	String location;
	
	public ChanduTextiles(int Id,String clothsName,int workersNumber,String brands[],String brandsForDifferentLocation[] ,String loc){
		System.out.println(" the cloths textiles ");
		id = Id ;
		name= clothsName;
		noOfWorkers= workersNumber;
		brands= brands;
		brandsForDifferentLocation= brandsForDifferentLocation ;
		location= loc;
		}
	
	public void sellingCloths(){
	}
	public void doBusiness(){
	}
		public void getAllBrands(String brands[]){
		
			for(int index=0;index<brands.length;index++){
				System.out.println(brands[index]);
			}
			
		}
}
	
	
	