class Airport {
    
     String name;
     String code;
     String city;
     String country;
     int terminals;
     int runways;
	 
	 public Airport(){
		 this("John F. Kennedy International Airport", "JFK", "New York", "USA", 6, 4);
		 
		 System.out.println("default cons of Airport is invoked");//const overloading -  // default - zero constr
	 }


    
    public Airport(String name, String code, String city, String country, int terminals, int runways) {
		System.out.println("parameterized cons of Airport is invoked");
        this.name = name;
        this.code = code;
        this.city = city;
        this.country = country;
        this.terminals = terminals;
        this.runways = runways;
    }

    
    public void printAirportInfo() {
        System.out.println("Airport Name: " + this.name);
        System.out.println("Airport Code: " + this.code);
        System.out.println("City: " + this.city);
        System.out.println("Country: " + this.country);
        System.out.println("Number of Terminals: " + this.terminals);
        System.out.println("Number of Runways: " + this.runways);
    }
}

