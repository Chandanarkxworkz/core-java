class Spotify {
	String songNames[] = new String[11];
	int index;
	// create / add /save
	public boolean addSongName(String songName){
	System.out.println("Inside add song Name()");
	boolean isAdded=false;
	
	if(index <songNames.length ){
		
	if(songName !=null){
	boolean exists  = checkIfSongNameExists(songName);//length /data/song check
	if(exists == false){
	System.out.println("validated song Name.. proceed to add song name");
	
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
	
		
		if(songNames[index]==songName){
			exists = true;
			
		}
	}
		return exists;
		
	}
	public String searchBySongName(String songName){
		System.out.println("invoked search by song name ");
		String musicName=null;
		for (int index=0;index<songNames.length;index++){
			if(songNames[index] == songName){
				musicName=songNames[index];
				
			}
		}
		return musicName;
	}
	String songNamesAfterDelete [] = new String [songNames.length-1];
	
	public boolean deleteBy(String name){
		boolean isDeleted =false;
		
		int ind=0;
		
		for (int index=0;index<songNames.length;index++){
			
			if(songNames[index]!=name){
				songNamesAfterDelete[ind++]=songNames[index];
				isDeleted=true;
			}
		}	
		return isDeleted;
	}
	public void getDeletedSongNames(){
		
		for(int index=0;index<songNamesAfterDelete.length;index++){
			System.out.println(songNamesAfterDelete[index]);
		}
	}
		
}