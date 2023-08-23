class Tv{

	static boolean isConnected;//static vari
	static int minVolume;
	static int maxVolume =5;
	static int currentVolume;
	
	public static boolean on(){
	System.out.println("starting of the Tv on");
	
	if (isConnected == false){ //false==false
		isConnected = true;
	System.out.println("the Tv is turned on....enjoy");
	}
	System.out.println("end of Tv on");
	return isConnected;
	}
	public static boolean off(){
	System.out.println("starting of the Tv off");
	if (isConnected == true){
	isConnected = false ;
	System.out.println("the Tv is turned Off");
	}
	System.out.println("end of Tv off");
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
			System.out.println(" turn on the Tv...");
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
			System.out.println("turn on the Tv...");
		}
		System.out.println("end of decreaseVolume");
	}
	
}
