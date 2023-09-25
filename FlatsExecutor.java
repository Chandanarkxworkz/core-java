class FlatsExecutor{
	public static void main(String[] paaa){
		
	
	Flats flats=new Flats();
	flats.setFlatId("455");
	flats.setNoOfDoors(10);
	flats.setNoOfWindoors(7);
		
	Apartments	apartments=new Apartments();
	apartments.flats=flats;
	
	apartments.apartmentName="jammu Apartments";
		System.out.println("------------------------------------------------------------------------");							
		System.out.println("Apartment Name : "+apartments.apartmentName);
		System.out.println("Flat Id : "+apartments.flats.getFlatId());
		System.out.println("No of Doors : "+apartments.flats.getNoOfDoors());
		System.out.println("No of Windoors : "+apartments.flats.getNoOfWindoors());
		System.out.println("------------------------------------------------------------------------");							

	}
}