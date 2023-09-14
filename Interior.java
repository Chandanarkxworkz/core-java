class Interior {
	String materialNames[] = new String[10];
	int index;
	// create / add /save
	public boolean addMaterialName(String materialName){
	System.out.println("Inside add material Name()");
	boolean isAdded=false;
	if(materialName !=null){
	System.out.println("validation is proper.. proceed to add material name");
	materialNames[index]= materialName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully " + materialName);
	}
	return isAdded;
	}
	public void getMaterialNames(){
	System.out.println("list of material names are:");
	for (int index=0;index<materialNames.length;index++){
	System.out.println(materialNames[index]);
	
	}
	}
}