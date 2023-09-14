class SpotifyExecutor{
	public static void main(String spo[]){
	
	Spotify spotify= new Spotify();
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
	spotify.addSongName("I Will Always Love You by Whitney Houston");
	spotify.getSongNames();
	}
	}