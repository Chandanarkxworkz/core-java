class StateExecutor1{
	public static void main(String[] ok){
		State1 state=new State1();
		state.setStateId("KA");
		state.setStateName("Karnataka");
		state.setNoOfDistricts(31);
		state.setCapital("Bengaluru");
		
		Country1 country=new Country1();
		country.state=state;
		
		country.countryName="India";
		System.out.println("------------------------------------------------------------------------");		
		System.out.println("Country name : "+country.countryName);
		System.out.println("State Id : "+country.state.getStateId());
		System.out.println("State Name : "+country.state.getStateName());
		System.out.println("No of Districts in the State : "+country.state.getNoOfDistricts());
		System.out.println("Capital name : "+country.state.getCapital());
		System.out.println("------------------------------------------------------------------------");				
	}
}