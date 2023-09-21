class Interior {
	String materialNames[] = new String[10];
	int index;
	// create / add /save
	public boolean addMaterialName(String materialName){
	System.out.println("Inside add material Name()");
	boolean isAdded=false;
	
	if(index <materialNames.length ){
		
	if(materialName !=null){
	boolean exists  = checkIfMaterialNameExists(materialName);//length /data/material check
	if(exists == false){
	System.out.println("validated material Name.. proceed to add material name");
	
	materialNames[index]= materialName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully " + materialName);
	}
	else{
		System.out.println(materialName + " already exists");
	}
	}
	}
	else{
		System.out.println("material names size is full...cannot proceed to add");
	}
	return isAdded;
	}
	//read
	public void getMaterialNames(){
	System.out.println("list of material names are:");
	for (int index=0;index<materialNames.length;index++){
	System.out.println(materialNames[index]);
	
	}
	}
	public boolean checkIfMaterialNameExists(String materialName){
		System.out.println("inside check If material Name Exists ():");
		boolean exists = false;
	for(int index=0;index<materialNames.length;index++){
		
		
		if(materialNames[index]==materialName){
			exists = true;
			
		}
	}
		return exists;
		
	}
	public String searchByMaterialName(String materialName){
		System.out.println("invoked search by material name ");
		String itemName=null;
		for (int index=0;index<materialNames.length;index++){
			if(materialNames[index] == materialName){
				itemName=materialNames[index];
				
			}
		}
		return itemName;
	}
	
	String materialNamesAfterDelete []= new String [materialNames.length-1];
	public boolean deleteBy(String name){
		boolean isDeleted =false;
		
		int ind=0;
		for (int index=0;index<materialNames.length;index++){
			
			if(materialNames[index]!=name){
				materialNamesAfterDelete[ind++]=materialNames[index];
				isDeleted=true;
			}
			
		}	
		return isDeleted;
	}
	public void getDeletedMaterialNames(){
		
		for(int index=0;index<materialNamesAfterDelete.length;index++){
			System.out.println(materialNamesAfterDelete[index]);
		}
	}
		
}