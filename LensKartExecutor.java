class LensKartExecutor{
	public static void main(String kart[]){
		
		LensKart lenskart = new LensKart();
		lenskart.price =800;
		lenskart.frameType="Full Rim";
		lenskart.frameSizeInMm  = 49;
		lenskart.shape="rectangle";
		lenskart.lenskartId=65437;
		
		
		System.out.println("price is " + lenskart.price);
		System.out.println(" frame Type is " + lenskart.frameType);
		System.out.println("frame Size is " + lenskart.frameSizeInMm);
		System.out.println("lenskart shape is " + lenskart.shape);
		System.out.println("lenskart Id is " + lenskart.lenskartId);
		
		lenskart.lens();
		System.out.println("_____________________________________________________");
		
		LensKart lenskart1 = new LensKart();
		lenskart1.price =1200;
		lenskart1.frameType="rim";
		lenskart1.frameSizeInMm  = 48;
		lenskart1.shape="round";
		lenskart1.lenskartId=567832;
		
		
		System.out.println("price is " + lenskart1.price);
		System.out.println(" frame Type is " + lenskart1.frameType);
		System.out.println("frame Size is " + lenskart1.frameSizeInMm);
		System.out.println("lenskart shape is " + lenskart1.shape);
		System.out.println("lenskart Id is " + lenskart1.lenskartId);
		
		lenskart1.lens();
		System.out.println("_____________________________________________________");
		
		LensKart lenskart2 = new LensKart();
		lenskart2.price =679;
		lenskart2.frameType="Full Rim";
		lenskart2.frameSizeInMm  = 51;
		lenskart2.shape="square";
		lenskart2.lenskartId=456763;
		
		
		System.out.println("price is " + lenskart2.price);
		System.out.println(" frame Type is " + lenskart2.frameType);
		System.out.println("frame Size is " + lenskart2.frameSizeInMm);
		System.out.println("lenskart shape is " + lenskart2.shape);
		System.out.println("lenskart Id is " + lenskart2.lenskartId);
		
		lenskart2.lens();
		System.out.println("_____________________________________________________");
		
		LensKart lenskart3 = new LensKart();
		lenskart3.price =1600;
		lenskart3.frameType="Full Rim";
		lenskart3.frameSizeInMm  = 55;
		lenskart3.shape="octogonal";
		lenskart3.lenskartId=234555;
		
		
		System.out.println("price is " + lenskart3.price);
		System.out.println(" frame Type is " + lenskart3.frameType);
		System.out.println("frame Size is " + lenskart3.frameSizeInMm);
		System.out.println("lenskart shape is " + lenskart3.shape);
		System.out.println("lenskart Id is " + lenskart3.lenskartId);
		
		lenskart3.lens();
		System.out.println("_____________________________________________________");
		
		LensKart lenskart4 = new LensKart();
		lenskart4.price =3500;
		lenskart4.frameType="Full Rim";
		lenskart4.frameSizeInMm  = 47;
		lenskart4.shape="oval";
		lenskart4.lenskartId=128767;
		
		
		System.out.println("price is " + lenskart4.price);
		System.out.println(" frame Type is " + lenskart4.frameType);
		System.out.println("frame Size is " + lenskart4.frameSizeInMm);
		System.out.println("lenskart shape is " + lenskart4.shape);
		System.out.println("lenskart Id is " + lenskart4.lenskartId);
		
		lenskart4.lens();
		System.out.println("_____________________________________________________");
	}
}