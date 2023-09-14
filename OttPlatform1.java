class OttPlatform1 {
	String movieNames[] = new String[3];
	int index;
	// create / add /save
	public boolean addMovieName(String movieName){
	System.out.println("Inside addMovieName()");
	boolean isAdded=false;
	//"shhhh..." !=null
	if(index <movieNames.length ){
		
	if(movieName !=null){//<= then -1 // if (index<movieNames.length) if // if(index >=movieNames.length){ system.out.print }else if (movieNmae!)
	boolean exists  = checkIfMovieNameExists(movieName);//length /data/movie check
	if(exists == false){
	System.out.println("validated movieName.. proceed to add movie name");
	//movieName[0]-"shh..."
	movieNames[index]= movieName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully " + movieName);
	}
	else{
		System.out.println(movieName + " already exists");
	}
	}
	}
	else{
		System.out.println("movie names size is full...cannot proceed to add");
	}
	return isAdded;
	}
	//read
	public void getMovieNames(){
	System.out.println("list of movie names are:");
	for (int index=0;index<movieNames.length;index++){
	System.out.println(movieNames[index]);
	
	}
	}
	public boolean checkIfMovieNameExists(String movieName){
		System.out.println("inside check If Movie Name Exists ():");
		boolean exists = false;
	for(int index=0;index<movieNames.length;index++){
		//shh.....==
		
		if(movieNames[index]==movieName){
			exists = true;
			
		}
	}
		return exists;
		
	}
}