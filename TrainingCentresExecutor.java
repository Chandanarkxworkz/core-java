class TrainingCentresExecutor {
	 public static void main(String[] train) {
      
        TrainingCentres centre1 = new TrainingCentres("Tech Training Hub", "New York", 10, 20, true, 500.0);
        TrainingCentres centre2 = new TrainingCentres("Code Masters", "Los Angeles", 8, 15, false, 450.0);
        TrainingCentres centre3 = new TrainingCentres("LearnIT Institute", "London", 12, 25, true, 550.0);
        TrainingCentres centre4 = new TrainingCentres("TechCamp", "Paris", 6, 12, false, 400.0);
        TrainingCentres centre5 = new TrainingCentres("Skill Builders", "Sydney", 15, 30, true, 600.0);

     
        centre1.printTrainingCentreInfo();
        centre2.printTrainingCentreInfo();
        centre3.printTrainingCentreInfo();
        centre4.printTrainingCentreInfo();
        centre5.printTrainingCentreInfo();
}
}