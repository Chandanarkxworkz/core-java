class SimExecutor{
	public static void main(String[] aaaa) {
        Sim sim = new Sim();
        sim.setSimName("airtel");
        sim.setNumber(706748363L);
        sim.setDatapack("5GB 249 rs");
        sim.setPrice(400);

        CellPhone cellPhone = new CellPhone();
        cellPhone.sim = sim;
        cellPhone.cellphoneName = "vivo y50";
	    System.out.println("-------------------------------------------------");							
        System.out.println("Cellphone Name: " + cellPhone.cellphoneName);
        System.out.println("SIM Name: " + cellPhone.sim.getSimName());
        System.out.println("SIM Number: " + cellPhone.sim.getNumber());
        System.out.println("Data Pack: " + cellPhone.sim.getDatapack());
        System.out.println("Price: " + cellPhone.sim.getPrice());
		System.out.println("-------------------------------------------------");							
    }
}