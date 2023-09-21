class OttPlatformExecutor1{
	public static void main(String ott[]){
		 DisneyPlusHotstar ottPlatform = new DisneyPlusHotstar();
	
	
	ottPlatform.addMovieName("baby");
	ottPlatform.addMovieName("dia");
	ottPlatform.addMovieName("baby");
	ottPlatform.addMovieName("aptamitra");
	ottPlatform.getMovieNames();
	
	System.out.println("searching mania");
	String mName =  "kantara";
	System.out.println("searching for the movie " + mName);
	String MovieNames = ottPlatform.searchByMovieName(mName);
	System.out.println("thank you for searching " + mName);
	
	
	
	boolean deletedMovie = ottPlatform.deleteBy("dia");
	System.out.println(" the dia is deleted " + deletedMovie);
	ottPlatform.getDeletedMovieNames();
	}
	}