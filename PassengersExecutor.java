class PassengersExecutor{
	public static void main(String[] travel){
		Passengers passengers=new Passengers();
		passengers.setPassengerId(6754);
		passengers.setPassengerName("Chandu");
		passengers.setStartingPoint("Bengaluru");
		passengers.setDestination("hassan");
		
		Train train= new Train();
		train.passengers=passengers;
		train.trainName="Solapur express";
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");		
		System.out.println("Train Name : "+train.trainName);
		System.out.println("Passengers Id : "+train.passengers.getPassengerId());
		System.out.println("Passengers Name : "+train.passengers.getPassengerName());
		System.out.println("Passengers Startig Point : "+train.passengers.getStartingPoint());
		System.out.println("Passengers Destination : "+train.passengers.getDestination());
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	}
}