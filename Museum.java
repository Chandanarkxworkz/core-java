class Museum {
    
     String name;
     String location;
     int numberOfExhibits;
     int visitorCapacity;
     boolean isFreeEntry;
     double entryFee;
	 public Museum(){
		 this("Louvre Museum", "Paris", 38000, 1000, false, 15.0);
		 System.out.println("default cons of museum is invoked");
	 }

   
    public Museum(String name, String location, int numberOfExhibits, int visitorCapacity, boolean isFreeEntry, double entryFee) {
		
		System.out.println("parameterized cons of museum is invoked");
        this.name = name;
        this.location = location;
        this.numberOfExhibits = numberOfExhibits;
        this.visitorCapacity = visitorCapacity;
        this.isFreeEntry = isFreeEntry;
        this.entryFee = entryFee;
    }

    
    public void printMuseumInfo() {
        System.out.println("Museum Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Number of Exhibits: " + this.numberOfExhibits);
        System.out.println("Visitor Capacity: " + this.visitorCapacity);
        System.out.println("Free Entry: " + this.isFreeEntry);
        System.out.println("Entry Fee: $" + this.entryFee);
        System.out.println();
}
}
