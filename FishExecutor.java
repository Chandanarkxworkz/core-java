class FishExecutor{
	public static void main(String[] meenu){
		Fish fish=new Fish();
		fish.setFishId(12);
		fish.setFishName("Catfish");
		fish.setPrice(500.0);
		fish.setWeight(10.8);
		
		Water1 water=new Water1();
		water.fish=fish;
		water.waterType="Sea water";
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Water Type : "+water.waterType);
		System.out.println("Fish Id : "+water.fish.getFishId());
		System.out.println("Fish Name : "+water.fish.getFishName());
		System.out.println("Fish Price : "+water.fish.getPrice());
		System.out.println("Fish Weigth : "+water.fish.getWeight());
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
}