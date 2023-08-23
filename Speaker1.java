class Speaker1{

	static boolean isConnected;//static vari
	static int minVolume;
	static int maxVolume =13;
	static int currentVolume;
	
	public static boolean onOrOff(){
	System.out.println("starting of the onOrOff");
	
	if (isConnected == false){
		isConnected = true;
	System.out.println("the speaker is turned on....enjoy");
	}
	else if (isConnected == true){
	isConnected = false ;
	System.out.println("the speaker is turned Off");
	}
	System.out.println("end of onOrOff");
	return isConnected;
	}
	public static void increaseVolume(){
		System.out.println("start of increaseVolume");
		
		if (isConnected == true){
			if (currentVolume < maxVolume){
				
				currentVolume= currentVolume +1;
				System.out.println("the current volume is " + currentVolume);
				
			}
			else {
				System.out.println("max volume is reached");
			}
			
		}
		else{
			System.out.println(" turn on the speaker...");
		}
		System.out.println("end of increaseVolume");
	}

public static void decreaseVolume(){
		System.out.println("start of decrease Volume");
		
		if (isConnected == true){
			if (currentVolume > minVolume){
				
				currentVolume= currentVolume -1;
				System.out.println("the current volume is " + currentVolume);
				
			}
			else {
				System.out.println("min volume is reached");
			}
			
		}
		else{
			System.out.println("turn on the speaker...");
		}
		System.out.println("end of decreaseVolume");
	}
	
}
