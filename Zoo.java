class Zoo {
    // instan 
     String name;
     String location;
     int numberOfAnimals;
     int numberOfEnclosures;
     boolean hasAquarium;// 2types overloading method (insta static)constru
     double admissionFee;
	 //default const
	 public Zoo(){
		 this("Wildlife Park", "New York", 1000, 50, true, 20.0);
		 System.out.println("default cons of zoo is invoked");//const overloading -  // default - zero constr
	 }

    // param const
    public Zoo(String name, String location, int numberOfAnimals, int numberOfEnclosures, boolean hasAquarium, double admissionFee) {
		// method-commun with one const another const within class //constr chaining - calling 1 cons from another constru // first only call//invoke default construct of same class
		System.out.println("parameterized cons is invoked");
        this.name = name;
        this.location = location;
        this.numberOfAnimals = numberOfAnimals;
        this.numberOfEnclosures = numberOfEnclosures;
        this.hasAquarium = hasAquarium;
        this.admissionFee = admissionFee;
    }

    
    public void printZooInfo() {
        System.out.println("Zoo Name: " +this.name);
        System.out.println("Location: " +this.location);
        System.out.println("Number of Animals: " +this.numberOfAnimals);
        System.out.println("Number of Enclosures: " +this.numberOfEnclosures);
        System.out.println("Has Aquarium: " +this.hasAquarium);
        System.out.println("Admission Fee: $" +this.admissionFee);
        System.out.println();
    }
}

   