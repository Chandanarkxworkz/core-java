class Gym {
    
     String name;
     String location;
     int capacity;
     int numberOfEquipment;
     boolean isOpen24Hours;
     double membershipFee;
	 
	 public Gym(){
		 this("Fitness First", "New York", 200, 50, true, 49.99);
		 System.out.println("default cons of Gym is invoked");
	 }

   
    public Gym(String name, String location, int capacity, int numberOfEquipment, boolean isOpen24Hours, double membershipFee) {
		System.out.println("parameterized cons of Gym is invoked");
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.numberOfEquipment = numberOfEquipment;
        this.isOpen24Hours = isOpen24Hours;
        this.membershipFee = membershipFee;
    }

    
    public void printGymInfo() {
        System.out.println("Gym Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Capacity: " + capacity + " members");
        System.out.println("Number of Equipment: " + this.numberOfEquipment);
        System.out.println("Open 24 Hours: " + this.isOpen24Hours);
        System.out.println("Membership Fee: $" + this.membershipFee);
        System.out.println();
    }
}
