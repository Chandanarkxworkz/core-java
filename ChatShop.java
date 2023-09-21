class ChatShop {
	String chatNames[] = new String[10];
	int index;
	// create / add /save
	public boolean addChatName(String chatName){
	System.out.println("Inside add chat Name()");
	boolean isAdded=false;
	
	if(index <chatNames.length ){
		
	if(chatName !=null){
	boolean exists  = checkIfChatNameExists(chatName);//length /data/chat check
	if(exists == false){
	System.out.println("validated chat Name.. proceed to add chat name");
	
	chatNames[index]= chatName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully " + chatName);
	}
	else{
		System.out.println(chatName + " already exists");
	}
	}
	}
	else{
		System.out.println("chat names size is full...cannot proceed to add");
	}
	return isAdded;
	}
	//read
	public void getChatNames(){
	System.out.println("list of chat names are:");
	for (int index=0;index<chatNames.length;index++){
	System.out.println(chatNames[index]);
	
	}
	}
	public boolean checkIfChatNameExists(String chatName){
		System.out.println("inside check If chat Name Exists ():");
		boolean exists = false;
	for(int index=0;index<chatNames.length;index++){
		
		
		if(chatNames[index]==chatName){
			exists = true;
			
		}
	}
		return exists;
		
	}
	public String searchByChatName(String chatName){
		System.out.println("invoked search by chat name ");
		String snacksName=null;
		for (int index=0;index<chatNames.length;index++){
			if(chatNames[index] == chatName){
				snacksName=chatNames[index];
				
			}
		}
		return snacksName;
	}
	String chatNamesAfterDelete [] = new String [chatNames.length-1];
	
	public boolean deleteBy(String name){
		boolean isDeleted =false;
		
		int ind=0;
		
		for (int index=0;index<chatNames.length;index++){
			
			if(chatNames[index]!=name){
				chatNamesAfterDelete[ind++]=chatNames[index];
				isDeleted=true;
			}
		}	
		return isDeleted;
	}
	public void getDeletedChatNames(){
		
		for(int index=0;index<chatNamesAfterDelete.length;index++){
			System.out.println(chatNamesAfterDelete[index]);
		}
	}
		
}

	
		
	
	