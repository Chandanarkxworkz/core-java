 class Amusement {
  
     String name;
     String location;
     int numberOfRides;
     int numberOfStalls;
     boolean hasWaterPark;
     double ticketPrice;
	 
	 public Amusement(){
		 this("Wonderland Park", "New York", 30, 10, true, 45.0);
		 System.out.println("default cons of Amusement is invoked");//const overloading -  // default - zero constr
	 }

  
    public Amusement(String name, String location, int numberOfRides, int numberOfStalls, boolean hasWaterPark, double ticketPrice) {
		System.out.println("parameterized cons of Amusement is invoked");
        this.name = name;
        this.location = location;
        this.numberOfRides = numberOfRides;
        this.numberOfStalls = numberOfStalls;
        this.hasWaterPark = hasWaterPark;
        this.ticketPrice = ticketPrice;
    }

    
    public void printAmusementInfo() {
        System.out.println("Amusement Park Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Number of Rides: " + this.numberOfRides);
        System.out.println("Number of Stalls: " + this.numberOfStalls);
        System.out.println("Has Water Park: " + this.hasWaterPark);
        System.out.println("Ticket Price: $" + this.ticketPrice);
        System.out.println();
    }
 }
