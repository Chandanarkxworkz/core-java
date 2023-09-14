class CricketTeam {
	String playerNames[] = new String[11];
	int index;
	// create / add /save
	public boolean addPlayerName(String playerName){
	System.out.println("Inside add player Name()");
	boolean isAdded=false;
	//"shhhh..." !=null
	if(index <playerNames.length ){
		
	if(playerName !=null){
	boolean exists  = checkIfPlayerNameExists(playerName);//length /data/player check
	if(exists == false){
	System.out.println("validated player Name.. proceed to add player name");
	//playerName[0]-"shh..."
	playerNames[index]= playerName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully " + playerName);
	}
	else{
		System.out.println(playerName + " already exists");
	}
	}
	}
	else{
		System.out.println("player names size is full...cannot proceed to add");
	}
	return isAdded;
	}
	//read
	public void getPlayerNames(){
	System.out.println("list of player names are:");
	for (int index=0;index<playerNames.length;index++){
	System.out.println(playerNames[index]);
	
	}
	}
	public boolean checkIfPlayerNameExists(String playerName){
		System.out.println("inside check If player Name Exists ():");
		boolean exists = false;
	for(int index=0;index<playerNames.length;index++){
		//shh.....==
		
		if(playerNames[index]==playerName){
			exists = true;
			
		}
	}
		return exists;
		
	}
}