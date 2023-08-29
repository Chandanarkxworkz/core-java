class SensorsExecutor{
	public static void main(String sense[]){
		
		Sensors sensor = new Sensors();
		sensor.price =1305;
		sensor.brand="biovibez";
		sensor.type  ="motion detector sensor";
		sensor.warrantyInYear=1.0F;
		sensor.powerInW=0.05F;
		
		
		System.out.println("price is " + sensor.price);
		System.out.println(" brand is " + sensor.brand);
		System.out.println("type is " + sensor.type);
		System.out.println("sensor warranty In Year is " + sensor.warrantyInYear);
		System.out.println("power in W is " + sensor.powerInW);
		
		sensor.detector();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		Sensors sensor1 = new Sensors();
		sensor1.price =811;
		sensor1.brand="MON";
		sensor1.type  ="solar street light motion sensor";
		sensor1.warrantyInYear=2.0F;
		sensor1.powerInW=2.5F;
		
		
		System.out.println("price is " + sensor1.price);
		System.out.println(" brand is " + sensor1.brand);
		System.out.println("type is " + sensor1.type);
		System.out.println("sensor warranty In Year is " + sensor1.warrantyInYear);
		System.out.println("power in W is " + sensor1.powerInW);
		
		sensor1.detector();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		Sensors sensor2 = new Sensors();
		sensor2.price =250;
		sensor2.brand="greenrabbit";
		sensor2.type  ="sound recorder and sound circuit sensor";
		sensor2.warrantyInYear=2.5F;
		sensor2.powerInW=0.10F;
		
		
		System.out.println("price is " + sensor2.price);
		System.out.println(" brand is " + sensor2.brand);
		System.out.println("type is " + sensor2.type);
		System.out.println("sensor warranty In Year is " + sensor2.warrantyInYear);
		System.out.println("power in W is " + sensor2.powerInW);
		
		sensor2.detector();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		Sensors sensor3 = new Sensors();
		sensor3.price =150;
		sensor3.brand="Republic";
		sensor3.type  ="micro controller board sensor";
		sensor3.warrantyInYear=1.5F;
		sensor3.powerInW=0.07F;
		
		
		System.out.println("price is " + sensor3.price);
		System.out.println(" brand is " + sensor3.brand);
		System.out.println("type is " + sensor3.type);
		System.out.println("sensor warranty In Year is " + sensor3.warrantyInYear);
		System.out.println("power in W is " + sensor3.powerInW);
		
		sensor3.detector();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		Sensors sensor4 = new Sensors();
		sensor4.price =1305;
		sensor4.brand="cam cart";
		sensor4.type  ="smoke sensor";
		sensor4.warrantyInYear=3.0F;
		sensor4.powerInW=0.15F;
		
		
		System.out.println("price is " + sensor4.price);
		System.out.println(" brand is " + sensor4.brand);
		System.out.println("type is " + sensor4.type);
		System.out.println("sensor warranty In Year is " + sensor4.warrantyInYear);
		System.out.println("power in W is " + sensor4.powerInW);
		
		sensor4.detector();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
}
}