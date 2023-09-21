class SpotifyExecutor{
	public static void main(String spo[]){
	
	PlayList spotify= new PlayList();
	spotify.addSongName("Bohemian Rhapsody by Queen");
	spotify.addSongName("Imagine by John Lennon");
	spotify.addSongName("Billie Jean by Michael Jackson");
	spotify.addSongName("Hotel California by Eagles");
	spotify.addSongName("Shape of You by Ed Sheeran");
	spotify.addSongName("Hey Jude by The Beatles");
	spotify.addSongName("Rolling in the Deep by Adele");
	spotify.addSongName("Stairway to Heaven by Led Zeppelin");
	spotify.addSongName("Uptown Funk by Mark Ronson ft. Bruno Mars");
	spotify.addSongName("Sweet Child o' Mine by Guns N' Roses");
	spotify.addSongName("Sweet Child o' Mine by Guns N' Roses");
	
	spotify.getSongNames();
	
	System.out.println("searching for song");
	String sName =  "sanam re";
	System.out.println("searching for the song " + sName);
	String SongNames = spotify.searchBySongName(sName);
	System.out.println("thank you for searching " + sName);
	
	
	
	boolean deletedSong = spotify.deleteBy("Rolling in the Deep by Adele");
	System.out.println("Rolling in the Deep by Adele" + deletedSong);
	spotify.getDeletedSongNames();
	}
	}