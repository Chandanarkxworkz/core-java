class OttPlatform1 {
	String movieNames[] = new String[3];
	int index;
	// create / add /save
	public boolean addMovieName(String movieName){
	System.out.println("Inside addMovieName()");
	boolean isAdded=false;
	if(movieName !=null){
	System.out.println("validation is proper.. proceed to add movie name");
	movieNames[index]= movieName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully" + movieName);
	}
	return isAdded;
	}
	public void getMovieNames(){
	System.out.println("list of movie names are:");
	for (int index=0;index<movieNames.length;index++){
	System.out.println(movieNames[index]);
	
	}
	}
}