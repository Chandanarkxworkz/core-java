class ChatShop {
	String chatNames[] = new String[10];
	int index;
	// create / add /save
	public boolean addChatName(String chatName){
	System.out.println("Inside add chat Name()");
	boolean isAdded=false;
	if(chatName !=null){
	System.out.println("validation is proper.. proceed to add chat name");
	chatNames[index]= chatName;
	index++;
	isAdded = true;
	System.out.println("added sucessfully :" + chatName);
	}
	return isAdded;
	}
	public void getChatNames(){
	System.out.println("list of chat names are :");
	for (int index=0;index<chatNames.length;index++){
	System.out.println(chatNames[index]);
	
	}
	}
}