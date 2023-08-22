class Speaker {
	
        static String speakerBrandName = "GOVO" ;
		static boolean isConnected ; //declaration // is compulsory
		static  int  maxVolume = 8 ;
		static int  currentVolume ;
		static int minVolume ;
		public static void main(String speaker[]){
			
			System.out.println("main started");
			System.out.println("--------------------------");
			System.out.println("speaker connection status");
			 isConnected = true ;
			System.out.println("is speaker connected : " + isConnected);
			 isConnected = false ;
			System.out.println("is speaker connected : " + isConnected);
			 currentVolume= currentVolume + 1 ;
			 currentVolume= currentVolume + 1 ;
			 currentVolume= currentVolume + 1 ;
			 currentVolume= currentVolume + 1 ;
			 currentVolume= currentVolume + 1 ;
			 currentVolume= currentVolume + 1 ;
			 currentVolume= currentVolume + 1 ;
			 currentVolume= currentVolume + 1 ;
			 System.out.println(" the current volume " + currentVolume);
			 
			System.out.println("main ended");
		
		}

}
