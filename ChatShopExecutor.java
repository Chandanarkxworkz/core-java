class ChatShopExecutor{
	public static void main(String cha[]){
	
	ChatShop chatShop= new ChatShop();
	
	chatShop.addChatName("Aloo chaat");
	chatShop.addChatName("bhelpuri");
	chatShop.addChatName("aloo tikki chaat");
	chatShop.addChatName("dahi puri");
	chatShop.addChatName("ragda patties");
	chatShop.addChatName("dahi vada");
	chatShop.addChatName("sev puri");
	chatShop.addChatName("mangode");
	chatShop.addChatName("papri chaat");
	chatShop.addChatName("Aloo chaat");
	chatShop.getChatNames();
	
	System.out.println("searching ");
	String cName =  "papri chaat";
	System.out.println("searching for the Chat " + cName);
	String ChatNames = chatShop.searchByChatName(cName);
	System.out.println("thank you for searching " + cName);
	
	
	
	boolean deletedChat = chatShop.deleteBy("dahi puri");
	System.out.println(" the dahi puri is deleted " + deletedChat);
	chatShop.getDeletedChatNames();
	}
	}
	