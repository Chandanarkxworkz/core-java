class Library {
   
     String name;
     String location;
     int capacity;
     int numberOfBooks;
     boolean isOpenOnWeekends;
     double lateFeePerDay;
	 
	  public Library(){
		 this("City Central Library", "New York", 500, 10000, true, 1.0);
		 System.out.println("default cons of Library is invoked");//const overloading -  // default - zero constr
	 }

   
    public Library(String name, String location, int capacity, int numberOfBooks, boolean isOpenOnWeekends, double lateFeePerDay) {
		System.out.println("parameterized cons of Library is invoked");
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.numberOfBooks = numberOfBooks;
        this.isOpenOnWeekends = isOpenOnWeekends;
        this.lateFeePerDay = lateFeePerDay;
    }

    
    public void printLibraryInfo() {
        System.out.println("Library Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Capacity: " + capacity + " visitors");
        System.out.println("Number of Books: " + this.numberOfBooks);
        System.out.println("Open on Weekends: " + this.isOpenOnWeekends);
        System.out.println("Late Fee Per Day: $" + this.lateFeePerDay);
        System.out.println();
    }
}
