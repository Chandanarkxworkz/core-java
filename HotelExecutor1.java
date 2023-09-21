class HotelExecutor1{
	public static void main(String hot[]){
	
	Hotel1 hotel= new Hotel1();
	hotel.addMenuName("dosa");
	hotel.addMenuName("biryani");
	hotel.addMenuName("curry");
	hotel.addMenuName("chilli chicken");
	hotel.addMenuName("kabab");
	hotel.addMenuName("parota");
	hotel.addMenuName("chitrana");
	hotel.addMenuName("pallav");
	hotel.addMenuName("biryani");
	hotel.addMenuName("fish fry");
	
	hotel.getMenuNames();
	
	System.out.println("searching menu");
	String mName =  "fish fry";
	System.out.println("searching for the Menu " + mName);
	String MenuNames = hotel.searchByMenuName(mName);
	System.out.println("thank you for searching " + mName);
	
	
	
	boolean deletedMenu = hotel.deleteBy("curry");
	System.out.println(" the curry is deleted " + deletedMenu);
	hotel.getDeletedMenuNames();
	}
	}
	