class SportsMania1{
	static String topTenBatsman[] = { "Kohli", "Smith", "Williamson", "Root", "Labuschagne", "Rahane", "Babar", "Warner", "Buttler","Stokes"};
	static String topTenCricketTeams[] = { "India", "Australia", "England", "New Zealand", "Pakistan", "South Africa", "Sri Lanka", "West Indies", "Bangladesh","Afghanistan"};
	static String topTenHockeyTeams[] = {" Canada", "Netherlands", "Australia", "Germany", "Belgium", "Argentina", "India", "Spain", "New Zealand","England"};
	static String topTenTennisPlayer[] = {" Djokovic", "Nadal", "Federer", "Medvedev", "Thiem", "Zverev", "Tsitsipas", "Berrettini", "Rublev","Schwartzman"};
    static String topTenBowlers[] = {"Bumrah", "Starc", "Rabada", "Boult", "Shami", "Cummins", "Woakes", "Hazelwood", "Ferguson","Mujeeb"}; 
            public static void main(String movies[] ){
			
			System.out.println("main started");
			System.out.println("original order: ");
			for ( int index = 0 ; index < topTenBatsman.length; index++){
			System.out.println("the top ten batsman  are " + topTenBatsman[index]);
	        }
			System.out.println("reversed order: ");
			for ( int index = topTenBatsman.length - 1; index >=0 ; index--){
			System.out.println("the top Ten Batsman are " + topTenBatsman[index]);
	        }
			System.out.println("original order: ");
			for ( int index = 0 ; index < topTenCricketTeams.length; index++){
			System.out.println("the top ten cricket teams  are " + topTenCricketTeams[index]);
			}
			System.out.println("reversed order: ");
			for ( int index = topTenCricketTeams.length - 1; index >=0 ; index--){
			System.out.println("the top Ten Cricket Teams  are " + topTenCricketTeams[index]);
	        }
			System.out.println("original order: ");
			for ( int index = 0 ; index < topTenHockeyTeams.length; index++){
			System.out.println("the top ten hockey teams  are " + topTenHockeyTeams[index]);
			}
			System.out.println("reversed order: ");
			for ( int index = topTenHockeyTeams.length - 1; index >=0 ; index--){
			System.out.println("the top Ten Hockey Teams are " + topTenHockeyTeams[index]);
	        }
			System.out.println("original order: ");
			for ( int index = 0 ; index < topTenTennisPlayer.length; index++){
			System.out.println("the top ten tennis player are " + topTenTennisPlayer[index]);
			}
			System.out.println("reversed order: ");
			for ( int index = topTenTennisPlayer.length - 1; index >=0 ; index--){
			System.out.println("the top Ten Tennis Player are " + topTenTennisPlayer[index]);
	        }
			System.out.println("original order: ");
			for ( int index = 0 ; index < topTenBowlers.length; index++){
			System.out.println("the top ten bowlers  are " + topTenBowlers[index]);
			}
			System.out.println("reversed order: ");
			for ( int index = topTenBowlers.length - 1; index >=0 ; index--){
			System.out.println("the top Ten Bowlers  are " + topTenBowlers[index]);
	        }
				
			System.out.println("main ended");
}
}