class HardwareExecutor{
	public static void main(String[] phone){
		
	
	Hardware hardware=new Hardware();
	hardware.setHardwareName("samsung");
	hardware.setPrice(20000);
	hardware.setComanyName("Xiaomi");
	hardware.setWeigth(600);
		
	Software software=new Software();
	software.hardware=hardware;
	software.softwareName="Android 12"; 
	System.out.println("------------------------------------------------------------------------");					
	System.out.println("Software in Hardware : "+software.softwareName);
	System.out.println("Hardware Component Name : "+software.hardware.getHardwareName());
	System.out.println("Price of the Hardware Component : "+software.hardware.getPrice());
	System.out.println("Company : "+software.hardware.getComanyName());
	System.out.println("weigth of the component in grams: "+software.hardware.getWeigth());		
	System.out.println("------------------------------------------------------------------------");						
	}
}