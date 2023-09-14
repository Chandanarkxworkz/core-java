class CricketTeam {
	String playerNames[] = new String[11];
	int index;
	// create / add /save
	public boolean addPlayerName(String playerName){
	System.out.println("Inside addPlayerName()");
	boolean isAdded=false;
	if(playerName !=null){
	System.out.println("validation is proper.. proceed to add player name");
	playerNames[index]= playerName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully " + playerName);
	}
	return isAdded;
	}
	public void getPlayerNames(){
	System.out.println("list of player names are:");
	for (int index=0;index<playerNames.length;index++){
	System.out.println(playerNames[index]);
	
	}
	}
}