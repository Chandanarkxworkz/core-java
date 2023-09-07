class Playstation {
    
     String model;
     String storageCapacity;
     int releaseYear;
     boolean isProModel;
     String color;
     double price;

	 public Playstation(){
		 this("PS5", "1TB SSD", 2020, true, "Black", 499.99);
		 System.out.println("default cons of Playstation is invoked");
	 }

    
    public Playstation(String model, String storageCapacity, int releaseYear, boolean isProModel, String color, double price) {
		System.out.println("parameterized cons of Playstation is invoked");
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.releaseYear = releaseYear;
        this.isProModel = isProModel;
        this.color = color;
        this.price = price;
    }

    
    public void printPlaystationInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Storage Capacity: " + this.storageCapacity);
        System.out.println("Release Year: " + this.releaseYear);
        System.out.println("Pro Model: " + this.isProModel);
        System.out.println("Color: " + this.color);
        System.out.println("Price: $" + this.price);
        System.out.println();
    }

   
}