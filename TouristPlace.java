class TouristPlace {
    
     String name;
     String location;
     String description;
     int visitorCount;
     double entranceFee;
     boolean isPopular;
	 
	  public TouristPlace(){
		 this("Eiffel Tower", "Paris", "Iconic iron structure", 7000000, 20.0, true);
		 System.out.println("default cons of TouristPlace is invoked");
	 }


    public TouristPlace(String name, String location, String description, int visitorCount, double entranceFee, boolean isPopular) {
		System.out.println("parameterized cons of TouristPlace is invoked");
        this.name = name;
        this.location = location;
        this.description = description;
        this.visitorCount = visitorCount;
        this.entranceFee = entranceFee;
        this.isPopular = isPopular;
    }

    
    public void printTouristPlaceInfo() {
        System.out.println("Tourist Place: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Description: " + this.description);
        System.out.println("Visitor Count: " + this.visitorCount);
        System.out.println("Entrance Fee: $" + this.entranceFee);
        System.out.println("Is Popular: " + this.isPopular);
        System.out.println();
    }
}
