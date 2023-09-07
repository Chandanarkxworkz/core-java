class PatientExecutor{
	public static void main(String[] pat) {
        // Create a new Patient object
        Patient patient = new Patient();
		patient.setName("John Doe");
        // Get and print patient information
		System.out.println("Patient Name: " + patient.getName());
		patient.setAge(30);
        System.out.println("Patient Age: " + patient.getAge());
		patient.setGender("male");
        System.out.println("Patient Gender: " + patient.getGender());
		patient.setHeight(175.5);
        System.out.println("Patient Height: " + patient.getHeight() + " cm");
		patient.setWeight(55.0);
        System.out.println("Patient Weight: " + patient.getWeight() + " kg");
	}
}