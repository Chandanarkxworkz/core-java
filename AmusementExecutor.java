class AmusementExecutor {
	public static void main(String Amuse[]){ 
	    Amusement park1 = new Amusement("Wonderland Park", "New York", 30, 10, true, 45.0);
        Amusement park2 = new Amusement("Thrill City", "Los Angeles", 20, 8, false, 35.0);
        Amusement park3 = new Amusement("Adventure World", "London", 40, 15, true, 50.0);
        Amusement park4 = new Amusement("Funland", "Paris", 25, 12, false, 40.0);
        Amusement park5 = new Amusement("Splash Kingdom", "Sydney", 15, 5, true, 55.0);

       
        park1.printAmusementInfo();
        park2.printAmusementInfo();
        park3.printAmusementInfo();
        park4.printAmusementInfo();
        park5.printAmusementInfo();
}
}
			