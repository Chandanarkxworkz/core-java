 class GymExecutor {
	 public static void main(String[] args) {
        
        Gym gym1 = new Gym("Fitness First", "New York", 200, 50, true, 49.99);
        Gym gym2 = new Gym("Powerhouse Gym", "Los Angeles", 150, 40, false, 39.99);
        Gym gym3 = new Gym("Anytime Fitness", "London", 100, 30, true, 59.99);
        Gym gym4 = new Gym("Gold's Gym", "Paris", 250, 60, false, 44.99);
        Gym gym5 = new Gym("24 Hour Fitness", "Sydney", 180, 45, true, 54.99);

        gym1.printGymInfo();
        gym2.printGymInfo();
        gym3.printGymInfo();
        gym4.printGymInfo();
        gym5.printGymInfo();
}
}