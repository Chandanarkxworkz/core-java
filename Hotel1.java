class Hotel1 {
	String menuNames[] = new String[10];
	int index;
	// create / add /save
	public boolean addMenuName(String menuName){
	System.out.println("Inside add menu Name()");
	boolean isAdded=false;
	if(menuName !=null){
	System.out.println("validation is proper.. proceed to add menu name");
	menuNames[index]= menuName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully " + menuName);
	}
	return isAdded;
	}
	public void getMenuNames(){
	System.out.println("list of menu names are:");
	for (int index=0;index<menuNames.length;index++){
	System.out.println(menuNames[index]);
	
	}
	}
}