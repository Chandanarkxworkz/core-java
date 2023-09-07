class Udyanavana {
    
     String name;
     String location;
     int areaInAcres;
     int numberOfTrees;
     int numberOfFlowers;
     boolean hasWaterFeature;
	 
	 public Udyanavana(){
		 this("City Park", "New York", 50, 1000, 5000, true);
		 System.out.println("default cons of Udyanavana is invoked");//const overloading -  // default - zero  argum constr
	 }


    
    public Udyanavana(String name, String location, int areaInAcres, int numberOfTrees, int numberOfFlowers, boolean hasWaterFeature) {
		System.out.println("parameterized cons of is invoked");
        this.name = name;
        this.location = location;
        this.areaInAcres = areaInAcres;
        this.numberOfTrees = numberOfTrees;
        this.numberOfFlowers = numberOfFlowers;
        this.hasWaterFeature = hasWaterFeature;
    }

    
    public void printUdyanavanaInfo() {
        System.out.println("Udyanavana Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Area (in acres): " + this.areaInAcres);
        System.out.println("Number of Trees: " + this.numberOfTrees);
        System.out.println("Number of Flowers: " + this.numberOfFlowers);
        System.out.println("Has Water Feature: " + this.hasWaterFeature);
        System.out.println();
}
}
