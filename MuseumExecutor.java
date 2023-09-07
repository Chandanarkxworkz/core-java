class MuseumExecutor {
	public static void main(String[] museum) {
       
        Museum museum1 = new Museum("Louvre Museum", "Paris", 38000, 1000, false, 15.0);
        Museum museum2 = new Museum("The British Museum", "London", 8000, 1500, true, 0.0);
        Museum museum3 = new Museum("Metropolitan Museum of Art", "New York", 20000, 2000, false, 25.0);
        Museum museum4 = new Museum("National Gallery of Art", "Washington D.C.", 15000, 1200, true, 0.0);
        Museum museum5 = new Museum("Australian Museum", "Sydney", 10000, 800, false, 10.0);

      
        museum1.printMuseumInfo();
        museum2.printMuseumInfo();
        museum3.printMuseumInfo();
        museum4.printMuseumInfo();
        museum5.printMuseumInfo();
}

}