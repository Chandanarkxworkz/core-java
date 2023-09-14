class ChatShop {
	String chatNames[] = new String[10];
	int index;
	// create / add /save
	public boolean addChatName(String chatName){
	System.out.println("Inside add chat Name()");
	boolean isAdded=false;
	//"shhhh..." !=null
	if(index <chatNames.length ){
		
	if(chatName !=null){//<= then -1 // if (index<chatNames.length) if // if(index >=chatNames.length){ system.out.print }else if (chatNmae!)
	boolean exists  = checkIfChatNameExists(chatName);//length /data/chat check
	if(exists == false){
	System.out.println("validated chat Name.. proceed to add chat name");
	//chatName[0]-"shh..."
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
		//shh.....==
		
		if(chatNames[index]==chatName){
			exists = true;
			
		}
	}
		return exists;
		
	}
}

	
		
	
	