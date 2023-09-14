class Spotify {
	String songNames[] = new String[11];
	int index;
	// create / add /save
	public boolean addSongName(String songName){
	System.out.println("Inside add song Name()");
	boolean isAdded=false;
	if(songName !=null){
	System.out.println("validation is proper.. proceed to add song name");
	songNames[index]= songName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully " + songName);
	}
	return isAdded;
	}
	public void getSongNames(){
	System.out.println("list of song names are:");
	for (int index=0;index<songNames.length;index++){
	System.out.println(songNames[index]);
	
	}
	}
}