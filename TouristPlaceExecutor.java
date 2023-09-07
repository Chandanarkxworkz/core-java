class TouristPlaceExecutor {
	public static void main(String tour[]){ 
		TouristPlace place1 = new TouristPlace("Eiffel Tower", "Paris", "Iconic iron structure", 7000000, 20.0, true);
        TouristPlace place2 = new TouristPlace("Machu Picchu", "Peru", "Ancient Inca city", 1500000, 30.0, true);
        TouristPlace place3 = new TouristPlace("Great Wall of China", "China", "Historical fortification", 10000000, 10.0, true);
        TouristPlace place4 = new TouristPlace("Statue of Liberty", "New York", "Symbol of freedom", 5000000, 25.0, true);
        TouristPlace place5 = new TouristPlace("Taj Mahal", "India", "Architectural masterpiece", 8000000, 15.0, true);

        
        place1.printTouristPlaceInfo();
        place2.printTouristPlaceInfo();
        place3.printTouristPlaceInfo();
        place4.printTouristPlaceInfo();
        place5.printTouristPlaceInfo();
}
}
		