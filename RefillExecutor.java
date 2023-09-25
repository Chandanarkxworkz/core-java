class RefillExecutor{
	public static void main(String[] ref){
		
	Refill refill=new Refill();
	refill.setRefillName("Excellent");
	refill.setColour("Black");
	refill.setType("ink");
		
	Pen pen=new Pen();
	pen.refill=refill;
	
	pen.penName="writo meter Pen";
	System.out.println("------------------------------------------------------------------------");							
	System.out.println("Pen Name"+pen.penName);
	System.out.println("Refill Name : "+pen.refill.getRefillName());
	System.out.println("Refill colour : "+pen.refill.getColour());
	System.out.println("Refill type : "+pen.refill.getType());
	System.out.println("------------------------------------------------------------------------");									
	}
}