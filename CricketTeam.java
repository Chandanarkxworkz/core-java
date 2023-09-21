class CricketTeam {
	String playerNames[] = new String[11];
	int index;
	// create / add /save
	public boolean addPlayerName(String playerName){
	System.out.println("Inside add player Name()");
	boolean isAdded=false;
	
	if(index <playerNames.length ){
		
	if(playerName !=null){
	boolean exists  = checkIfPlayerNameExists(playerName);//length /data/player check
	if(exists == false){
	System.out.println("validated player Name.. proceed to add player name");
	
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
		
		
		if(playerNames[index]==playerName){
			exists = true;
			
		}
	}
		return exists;
		
	}
public String searchByPlayerName(String playerName){
		System.out.println("invoked search by player name ");
		String gameName=null;
		for (int index=0;index<playerNames.length;index++){
			if(playerNames[index] == playerName){
				gameName=playerNames[index];
				
			}
		}
		return gameName;
	}
	String playerNamesAfterDelete [] = new String [playerNames.length-1];
	
	public boolean deleteBy(String name){
		boolean isDeleted =false;
		
		int ind=0;
		
		for (int index=0;index<playerNames.length;index++){
			
			if(playerNames[index]!=name){
				playerNamesAfterDelete[ind++]=playerNames[index];
				isDeleted=true;
			}
		}	
		return isDeleted;
	}
	public void getDeletedPlayerNames(){
		
		for(int index=0;index<playerNamesAfterDelete.length;index++){
			System.out.println(playerNamesAfterDelete[index]);
		}
	}
		
}