class Ac{

	static boolean isConnected;//static variable
	static int minTemp;
	static int maxTemp =10;
	static int currentTemp;
	public static boolean on(){
	System.out.println("starting of the Ac on");
	
	if (isConnected == false){
		isConnected = true;
	System.out.println("the temperature is turned on....");
	System.out.println("end of the Ac On");
	}
	return isConnected;
	}
	public static boolean off(){
		System.out.println("starting of Ac the off");
	 if (isConnected == true){
	isConnected = false ;
	System.out.println("the temperature is turned Off");
	System.out.println("end of Ac the Off");
	 }
	return isConnected;
	}
		
	public static boolean increaseTemperature(){
		System.out.println("start of increase temperature");
		
		if (isConnected == true){
			if (currentTemp < maxTemp){
				
				currentTemp= currentTemp +1;
				System.out.println("the current temperature is " + currentTemp);
				
			}
			else {
				System.out.println("max Temperature is reached");
			}
			
		}
		else{
			System.out.println(" turn on Ac the Ac...");
		}
		System.out.println("end of increaseTemperature");
		return isConnected;
	}

public static boolean decreaseTemperature(){
		System.out.println("start of decrease temperature");
		
		if (isConnected == true){
			if (currentTemp > minTemp){
				
				currentTemp= currentTemp -1;
				System.out.println("the current temperature is " + currentTemp);
				
			}
			else {
				System.out.println("min temperature is reached");
			}
			
		}
		else{
			System.out.println("turn on the AC...");
		}
		System.out.println("end of decrease temperature");
		return isConnected;
		
	}
	
}
