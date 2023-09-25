class SoilExecutor{
	 public static void main(String[] plantgrowth) {
        Soil soil = new Soil();
        soil.setSoilName("black");
        soil.setMoistur("55% to 85%");
        soil.setMinerals("potassium, alumina, and water");

        Plant plant = new Plant();
        plant.soil = soil;
        plant.plantName = "sugar";
	System.out.println("------------------------------------------------------------------------");							
    System.out.println("Plant Name: " + plant.plantName);
    System.out.println("Soil Name: " + plant.soil.getSoilName());
    System.out.println("Moisture: " + plant.soil.getMoistur());
    System.out.println("Minerals: " + plant.soil.getMinerals());
	System.out.println("------------------------------------------------------------------------");							
    }
}