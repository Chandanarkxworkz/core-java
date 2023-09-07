class BusStandExecution{
	public static void main(String[] bus) {
      
        BusStand busStand = new BusStand();

      busStand.setName("City Bus Stand"); 
        System.out.println("Bus Stand Name: " + busStand.getName());
		busStand.setLocation("hassan");
        System.out.println("Bus Stand Location: " + busStand.getLocation());
		busStand.setBusStops(6);
        System.out.println("Number of Bus Stops: " + busStand.getBusStops());
		busStand.setSeatingCapacity(250);
        System.out.println("Seating Capacity: " + busStand.getSeatingCapacity());
		busStand.setHasRestroom(false);
        System.out.println("Has Restroom: " + (busStand.hasRestroom() ? "Yes" : "No"));
		}
}