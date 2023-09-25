class GasExecutor{
	 public static void main(String[] jjkj) {
       Gas gas=new Gas();
	   gas.setGasName("Domestic usage");
	   gas.setVolume(20.5);
	   gas.setPrice(1500.00);
	   
	   Cylinder cylinder=new Cylinder();
	   cylinder.gas=gas;
	   cylinder.cylinderName="Bharat";
	System.out.println("------------------------------------------------------------------------");							
    System.out.println("Cylinder Name: " +cylinder.cylinderName);
    System.out.println("Gas Type: " + cylinder.gas.getGasName());
    System.out.println("Gas Volume: " + cylinder.gas.getVolume()+ " liters");
	System.out.println("Gas price: " + cylinder.gas.getPrice());
	System.out.println("------------------------------------------------------------------------");							
    }
}