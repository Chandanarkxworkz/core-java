class Hotel1 {
	String menuNames[] = new String[10];
	int index;
	// create / add /save
	public boolean addMenuName(String menuName){
	System.out.println("Inside add menu Name()");
	boolean isAdded=false;
	
	if(index <menuNames.length ){
		
	if(menuName !=null){
	boolean exists  = checkIfMenuNameExists(menuName);
	if(exists == false){
	System.out.println("validated menuName.. proceed to add menu name");
	
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
		
		
		if(menuNames[index]==menuName){
			exists = true;
			
		}
	}
		return exists;
		
	}
	public String searchByMenuName(String menuName){
		System.out.println("invoked search by menu name ");
		String carteName=null;
		for (int index=0;index<menuNames.length;index++){
			if(menuNames[index] == menuName){
				carteName=menuNames[index];
				
			}
		}
		return carteName;
	}
	String menuNamesAfterDelete [] = new String [menuNames.length-1];
	
	public boolean deleteBy(String name){
		boolean isDeleted =false;
		
		int ind=0;
		
		for (int index=0;index<menuNames.length;index++){
			
			if(menuNames[index]!=name){
				menuNamesAfterDelete[ind++]=menuNames[index];
				isDeleted=true;
			}
		}	
		return isDeleted;
	}
	public void getDeletedMenuNames(){
		
		for(int index=0;index<menuNamesAfterDelete.length;index++){
			System.out.println(menuNamesAfterDelete[index]);
		}
	}
		
}