class ClientsExecutor{
	public static void main(String[] soft){
		
	
	Clients clients=new Clients();
	clients.setClientName("canara");
	clients.setWorthInCr(300);
	clients.setProduct("Banking application");
		
	Companies	companies=new Companies();
	companies.clients=clients;
	companies.companieName="wipro";
	System.out.println("------------------------------------------------------------------------");							
	System.out.println("Company Name : "+companies.companieName);
	System.out.println("Client Name : "+companies.clients.getClientName());
	System.out.println("Contarct worth in Cr : "+companies.clients.getWorthInCr());
	System.out.println("Product : "+companies.clients.getProduct());
	System.out.println("------------------------------------------------------------------------");									
	}
}