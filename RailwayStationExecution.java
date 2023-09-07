class RailwayStationExecution{
	public static void main(String[] args) {
        // Create a new RailwayStation object
        RailwayStation station = new RailwayStation();

        station.setName("central station");
        System.out.println("Station Name: " + station.getName());
		station.setLocation("banglore");
        System.out.println("Station Location: " + station.getLocation());
		station.setPlatforms(10);
        System.out.println("Number of Platforms: " + station.getPlatforms());
		station.setPassengerCapacity(5500);
        System.out.println("Passenger Capacity: " + station.getPassengerCapacity());
		station.setHasParking(false);
        System.out.println("Has Parking: " + (station.hasParking() ? "Yes" : "No"));

        
}

}