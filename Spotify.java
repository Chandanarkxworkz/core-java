class Spotify {
	String songNames[] = new String[11];
	int index;
	// create / add /save
	public boolean addSongName(String songName){
	System.out.println("Inside add song Name()");
	boolean isAdded=false;
	//"shhhh..." !=null
	if(index <songNames.length ){
		
	if(songName !=null){
	boolean exists  = checkIfSongNameExists(songName);//length /data/song check
	if(exists == false){
	System.out.println("validated song Name.. proceed to add song name");
	//songName[0]-"shh..."
	songNames[index]= songName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully " + songName);
	}
	else{
		System.out.println(songName + " already exists");
	}
	}
	}
	else{
		System.out.println("song names size is full...cannot proceed to add");
	}
	return isAdded;
	}
	//read
	public void getSongNames(){
	System.out.println("list of song names are:");
	for (int index=0;index<songNames.length;index++){
	System.out.println(songNames[index]);
	
	}
	}
	public boolean checkIfSongNameExists(String songName){
		System.out.println("inside check If song Name Exists ():");
		boolean exists = false;
	for(int index=0;index<songNames.length;index++){
		//shh.....==
		
		if(songNames[index]==songName){
			exists = true;
			
		}
	}
		return exists;
		
	}
}