class ZooExecutor{
	public static void main(String[] zo) {
		
        

       // this method is used to const chaining- calling one achievedc by this only firdst
        
		Zoo zoo1 = new Zoo("Wildlife Park", "New York", 1000, 50, true, 20.0);
        Zoo zoo2 = new Zoo("Jungle Safari", "Los Angeles", 800, 40, false, 15.0);
        Zoo zoo3 = new Zoo("Savannah Zoo", "London", 1200, 60, true, 25.0);
        Zoo zoo4 = new Zoo("Animal Kingdom", "Paris", 900, 45, false, 18.0);
        Zoo zoo5 = new Zoo("Aquatic Zoo", "Sydney", 500, 30, true, 22.0);

        // Printing information for each Zoo
        zoo1.printZooInfo();
        zoo2.printZooInfo();
        zoo3.printZooInfo();
        zoo4.printZooInfo();
        zoo5.printZooInfo();
		// const recurision is not possible in java 
		/*this method only used inside constructor chain*/
		
}
}

