class ChainTester{
	public static void main(String jewel[]){
		
		Chain chain = new Chain();
		chain.price =5000;
		chain.brand="FABUNORA";
		chain.weightInGram = 5;
		chain.chainColor="Black";
		chain.chainId=156788;
		
		
		System.out.println("price is " + chain.price);
		System.out.println(" brand is " + chain.brand);
		System.out.println("weight is " + chain.weightInGram);
		System.out.println("chain color is " + chain.chainColor);
		System.out.println("chain Id is " + chain.chainId);
		
		chain.jewelry();
		System.out.println("_____________________________________________________");
		
		Chain chain1 = new Chain();
		chain1.price =8000;
		chain1.brand="Zorvi";
		chain1.weightInGram = 8;
		chain1.chainColor="silver";
		chain1.chainId=178756;
		
		
		System.out.println("price is " + chain1.price);
		System.out.println(" brand is " + chain1.brand);
		System.out.println("weight is " + chain1.weightInGram);
		System.out.println("chain color is " + chain1.chainColor);
		System.out.println("chain Id is " + chain1.chainId);
		
		chain1.jewelry();
		System.out.println("_____________________________________________________");
		
		Chain chain2 = new Chain();
		chain2.price =4000;
		chain2.brand="Niiska";
		chain2.weightInGram = 3;
		chain2.chainColor="white";
		chain2.chainId=67547;
		
		
		System.out.println("price is " + chain2.price);
		System.out.println(" brand is " + chain2.brand);
		System.out.println("weight is " + chain2.weightInGram);
		System.out.println("chain color is " + chain2.chainColor);
		System.out.println("chain Id is " + chain2.chainId);
		
		chain2.jewelry();
		System.out.println("_____________________________________________________");
		
		Chain chain3 = new Chain();
		chain3.price =1000;
		chain3.brand="BOGHRA";
		chain3.weightInGram = 7;
		chain3.chainColor="GOLD";
		chain3.chainId=6787634;
		
		
		System.out.println("price is " + chain3.price);
		System.out.println(" brand is " + chain3.brand);
		System.out.println("weight is " + chain3.weightInGram);
		System.out.println("chain color is " + chain3.chainColor);
		System.out.println("chain Id is " + chain3.chainId);
		
		chain3.jewelry();
		System.out.println("_____________________________________________________");
		
		Chain chain4 = new Chain();
		chain4.price =1500;
		chain4.brand="FASHION FRILL";
		chain4.weightInGram = 10;
		chain4.chainColor="COPPER";
		chain4.chainId=2455667;
		
		
		System.out.println("price is " + chain4.price);
		System.out.println(" brand is " + chain4.brand);
		System.out.println("weight is " + chain4.weightInGram);
		System.out.println("chain color is " + chain4.chainColor);
		System.out.println("chain Id is " + chain4.chainId);
		
		chain4.jewelry();
		System.out.println("_____________________________________________________");
}
}