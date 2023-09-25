class PatientExecutor1{
	public static void main(String[] pat){
		
	Patient1 patient=new Patient1();
	patient.setPatientId(777);
	patient.setPatientName("charan");
	patient.setDiseases("head ache");
	patient.setDocName("swathi");
	
		
	Hospital1 hospital=new Hospital1();
	hospital.patient=patient;
	hospital.hospitalName="manipal Hospital";
	System.out.println("------------------------------------------------------------------------");							
	System.out.println("Hospital Name : "+hospital.hospitalName);
	System.out.println("Patient Id : "+hospital.patient.getPatientId());
	System.out.println("Patient Name : "+hospital.patient.getPatientName());
	System.out.println("Diseases : "+hospital.patient.getDiseases());
	System.out.println("Doctor name : "+hospital.patient.getDocName());
	System.out.println("------------------------------------------------------------------------");							
	}
}