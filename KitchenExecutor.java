class KitchenExecutor{
	public static void main(String[] food){
		Kitchen kitchen=new Kitchen();
		kitchen.setKitchenName("Savi ruchi kitchen ");
		kitchen.setCookName("Pavan");
		kitchen.setDishName("Biryani");
		kitchen.setTypeOfDish("Spicy");
		
		Hotel2 hotel=new Hotel2();
		hotel.kitchen=kitchen;
		hotel.hotelName="New shanthi sagar";
		
		System.out.println("Hotel Name : "+hotel.hotelName);
		System.out.println("------------------------------------------------------------------------");				
		System.out.println("Kitchen Name : "+hotel.kitchen.getKitchenName());
		System.out.println("Kitchen Cook Name : "+hotel.kitchen.getCookName());
		System.out.println("Dish Cooked in Kitchen : "+hotel.kitchen.getDishName());
		System.out.println("Type of Dish : "+hotel.kitchen.getTypeOfDish());
		System.out.println("------------------------------------------------------------------------");				
	}
}