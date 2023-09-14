class Hotel1 {
	String menuNames[] = new String[10];
	int index;
	// create / add /save
	public boolean addMenuName(String menuName){
	System.out.println("Inside add menu Name()");
	boolean isAdded=false;
	//"shhhh..." !=null
	if(index <menuNames.length ){
		
	if(menuName !=null){
	boolean exists  = checkIfMenuNameExists(menuName);
	if(exists == false){
	System.out.println("validated menuName.. proceed to add menu name");
	//menuName[0]-"shh..."
	menuNames[index]= menuName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully " + menuName);
	}
	else{
		System.out.println(menuName + " already exists");
	}
	}
	}
	else{
		System.out.println("menu names size is full...cannot proceed to add");
	}
	return isAdded;
	}
	//read
	public void getMenuNames(){
	System.out.println("list of menu names are:");
	for (int index=0;index<menuNames.length;index++){
	System.out.println(menuNames[index]);
	
	}
	}
	public boolean checkIfMenuNameExists(String menuName){
		System.out.println("inside check If menu Name Exists ():");
		boolean exists = false;
	for(int index=0;index<menuNames.length;index++){
		//shh.....==
		
		if(menuNames[index]==menuName){
			exists = true;
			
		}
	}
		return exists;
		
	}
}