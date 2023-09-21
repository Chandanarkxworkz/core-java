class CricketTeamExecutor{
	public static void main(String cric[]){
	
	CricketTeam cricketTeam= new CricketTeam();
	cricketTeam.addPlayerName("Virat Kohli");
	cricketTeam.addPlayerName("Steve Smith");
	cricketTeam.addPlayerName("Kane Williamson");
	cricketTeam.addPlayerName("Joe Root");
	cricketTeam.addPlayerName("Virat Kohli");
	cricketTeam.addPlayerName("Rohit Sharma");
	cricketTeam.addPlayerName("Babar Azam");
	cricketTeam.addPlayerName("Quinton de Kock");
	cricketTeam.addPlayerName("David Warner");
	cricketTeam.addPlayerName("Jasprit Bumrah");
	cricketTeam.addPlayerName("Kagiso Rabada");
	
	
	cricketTeam.getPlayerNames();
	
	System.out.println("searching ");
	String pName =  "Virat Kohli";
	System.out.println("searching for the Player " + pName);
	String PlayerNames = cricketTeam.searchByPlayerName(pName);
	System.out.println("thank you for searching " + pName);
	
	
	
	boolean deletedPlayer = cricketTeam.deleteBy("Joe Root");
	System.out.println(" the joe root is deleted " + deletedPlayer);
	cricketTeam.getDeletedPlayerNames();
	}
	}
	