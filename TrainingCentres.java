class TrainingCentres {
    
     String name;
     String location;
     int numberOfInstructors;
     int numberOfCourses;
     boolean offersCertification;
     double courseFee;
	 
	 public TrainingCentres(){
		 this("Tech Training Hub", "New York", 10, 20, true, 500.0);
		 System.out.println("default cons of TrainingCentres is invoked");//const overloading -  // default - zero constr
	 }
	 
	 

    public TrainingCentres(String name, String location, int numberOfInstructors, int numberOfCourses, boolean offersCertification, double courseFee) {
		System.out.println("parameterized cons of TrainingCentres is invoked");
        this.name = name;
        this.location = location;
        this.numberOfInstructors = numberOfInstructors;
        this.numberOfCourses = numberOfCourses;
        this.offersCertification = offersCertification;
        this.courseFee = courseFee;
    }

  
    public void printTrainingCentreInfo() {
        System.out.println("Training Centre Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Number of Instructors: " + this.numberOfInstructors);
        System.out.println("Number of Courses: " + this.numberOfCourses);
        System.out.println("Offers Certification: " + this.offersCertification);
        System.out.println("Course Fee: $" + this.courseFee);
        System.out.println();
    }
}
