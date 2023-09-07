class LibraryExecutor {
	public static void main(String lib[]){ 
		Library library1 = new Library("City Central Library", "New York", 500, 10000, true, 1.0);
        Library library2 = new Library("Downtown Public Library", "Los Angeles", 300, 8000, true, 0.75);
        Library library3 = new Library("National Library", "London", 1000, 20000, true, 1.25);
        Library library4 = new Library("City Public Library", "Paris", 400, 9000, false, 1.5);
        Library library5 = new Library("State Library", "Sydney", 600, 12000, true, 1.0);

       
        library1.printLibraryInfo();
        library2.printLibraryInfo();
        library3.printLibraryInfo();
        library4.printLibraryInfo();
        library5.printLibraryInfo();
}
}
			
