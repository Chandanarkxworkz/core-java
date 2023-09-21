class InteriorExecutor{
	public static void main(String inter[]){
	
	Interior interior= new Interior();
	
	interior.addMaterialName("Hardwood");
	interior.addMaterialName("Ceramic Tile");
	interior.addMaterialName("Granite");
	interior.addMaterialName("Marble");
	interior.addMaterialName("Laminate");
	interior.addMaterialName("Carpet");
	interior.addMaterialName("Glass");
	interior.addMaterialName("Brick");
	interior.addMaterialName("Metal");
	interior.addMaterialName("gold");
	interior.getMaterialNames();
	
	System.out.println("searching for materials");
	String mName =  "Glass";
	System.out.println("searching for the material " + mName);
	String MaterialNames = interior.searchByMaterialName(mName);
	System.out.println("thank you for searching " + mName);
	
	
	
	boolean deletedMaterial = interior.deleteBy("Carpet");
	System.out.println(" the carpet is deleted " + deletedMaterial);
	interior.getDeletedMaterialNames();
	}
	}
	





