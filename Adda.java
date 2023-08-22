class AddaTimes1{
	static String kannadaMovieNames[] = {" KGF Chapter 2"," Gandhada Gudi","Kantara","KGF Chapter 1","777 Charlie","RangiTaranga","Lucia","Ulidavaru Kandanthe","Uppi 2","Ugramm","Garuda Gamana Vrishabha Vahana","Kirik Party","James","Love Mocktail","Raajakumara","Ratnan Prapancha","Mungaru Male","U Turn","Godhi Banna Sadharana Mykattu","Kavaludaari","Thithi","Super","Simple Agi Ondh Love Story","Bell Bottom","Mr. And Mrs. Ramchari"};
	static String englishMovieNames[] = { "Avatar", "Titanic", "The Avengers", "Jurassic Park", "Star Wars","The Lord of the Rings", "Pulp Fiction", "The Shawshank Redemption", "Inception", "The Matrix","Frozen", "Toy Story", "Finding Nemo", "The Lion King", "Harry Potter","Spider-Man", "Black Panther", "Wonder Woman", "The Dark Knight", "Forrest Gump","E.T. the Extra-Terrestrial", "Back to the Future", "Indiana Jones", "Jaws", "Avatar 2"};
	static String hindiMovieNames[] = { "Guzaarish","The Japanese Wife","Baghban"," Kabhi Khushi Kabhie Gham..."," Drishyam"," Dharm","Thirst"," Raincoat"," Devdas"," Kaksparsh"," Baahubali: The Beginning", "Jodhaa Akbar"," Mughal-E-Azam","OMG: Oh My God!"," Mohabbatein"," Rann"," Dabangg ","3 Idiots ","Toilet: A Love Story"," Kesari"," Pad Man"," Cycle"," Gulabjaam","Bodyguard"," Lion" };
	static String teluguMovieNames[] = { "Baahubali", "Arjun Reddy", "Rangasthalam","Jersey","Maharshi","Ala Vaikunthapurramuloo","Sye","Magadheera", "Gabbar Singh","Eega","Attarintiki Daredi","Nannaku Prematho","Baahubali 2: The Conclusion","Bharat Ane Nenu","Geetha Govindam","Saaho","Oh My Friend","Pelli Choopulu","Manam","Awe!","Gentleman","Mirchi","Evaru","F2: Fun and Frustration","KGF" };
    static String malayalamMovieNames[] = { "Uyare","Irul",	"Njan Prakashan","Forensic","Lilli","Grandmaster","Comrade In America","Varane Avashyamund","Swathanthryam Ardharathriyil",	"Nayattu","Angamaly Diaries","Kappela","Aalorukkam","Vikrithi","Maniyarayile Ashokan","Love","Kurup","Sudani From Nigeria","Kilometers and Kilometers","Kuttavum Shikshayum","Thottappan","Minnal Murali","Jana Gana Mana","Vaashi" ,"Night Drive" }; 
            
        public static void main(String movies[] ){
			System.out.println("main started");
			for ( int index = 0 ; index < kannadaMovieNames.length; index++){
			System.out.println("the kannada Movie Names  are " + kannadaMovieNames[index]);
	}
			
			for ( int index = 0 ; index < englishMovieNames.length; index++){
			System.out.println("the english Movie Names  are " + englishMovieNames[index]);
			}
			for ( int index = 0 ; index < hindiMovieNames.length; index++){
			System.out.println("the hindi Movie Names  are " + hindiMovieNames[index]);
			}
			for ( int index = 0 ; index < teluguMovieNames.length; index++){
			System.out.println("the telugu Movie Names  are " + teluguMovieNames[index]);
			}
			for ( int index = 0 ; index < malayalamMovieNames.length; index++){
			System.out.println("the malayalam Movie Names  are " + malayalamMovieNames[index]);
			}
			System.out.println("main ended");
}
}