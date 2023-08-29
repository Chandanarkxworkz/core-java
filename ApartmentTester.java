class ApartmentTester{
	public static void main(String apart[]){
		// new keyword used to create objectin java
		//classname refvariable = new Classname();
		Apartment apartment = new Apartment();
		apartment.apartmentId =1;
		apartment.apartmentName="Prestige";
		apartment.location ="Whitefield";
		apartment.noOfFloors=30;
		apartment.noOfTwoBhkFlats= 60;
		apartment.noOfThreeBhkFlats=100;
		
		System.out.println("ApartmentId is " + apartment.apartmentId);
		System.out.println("Apartment name is " + apartment.apartmentName);
		System.out.println("Apartment location is " + apartment.location);
		System.out.println("Apartment no of floors is " + apartment.noOfFloors);
		System.out.println("Apartment no of two bhk flats is " + apartment.noOfTwoBhkFlats);
		System.out.println("Apartment no of three bhk flats is " + apartment.noOfThreeBhkFlats);
		
		apartment.provideAccomadation();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		//Speaker.onOrOff; // variables and method are acessed by dot
		Apartment apartment1 = new Apartment();
		apartment1.apartmentId =3;
		apartment1.apartmentName="Prestige";
		apartment1.location ="BTM";
		apartment1.noOfFloors=50;
		apartment1.noOfTwoBhkFlats= 160;
		apartment1.noOfThreeBhkFlats=180;
		
		System.out.println("ApartmentId is " + apartment1.apartmentId);
		System.out.println("Apartment name is " + apartment1.apartmentName);
		System.out.println("Apartment location is " + apartment1.location);
		System.out.println("Apartment no of floors is " + apartment1.noOfFloors);
		System.out.println("Apartment no of two bhk flats is " + apartment1.noOfTwoBhkFlats);
		System.out.println("Apartment no of three bhk flats is " + apartment1.noOfThreeBhkFlats);
		apartment1.provideAccomadation();
		System.out.println("**********************************************");
		
		
		Apartment apartment2 = new Apartment();
		apartment2.apartmentId =6;
		apartment2.apartmentName="Prestige";
		apartment2.location ="rajajinagar";
		apartment2.noOfFloors=150;
		apartment2.noOfTwoBhkFlats= 60;
		apartment2.noOfThreeBhkFlats=280;
		
		System.out.println("ApartmentId is " + apartment2.apartmentId);
		System.out.println("Apartment name is " + apartment2.apartmentName);
		System.out.println("Apartment location is " + apartment2.location);
		System.out.println("Apartment no of floors is " + apartment2.noOfFloors);
		System.out.println("Apartment no of two bhk flats is " + apartment2.noOfTwoBhkFlats);
		System.out.println("Apartment no of three bhk flats is " + apartment2.noOfThreeBhkFlats);
		apartment2.provideAccomadation();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Apartment apartment3 = new Apartment();
		apartment3.apartmentId =5;
		apartment3.apartmentName="Prestige";
		apartment3.location ="rajarajeshwari nagar";
		apartment3.noOfFloors=160;
		apartment3.noOfTwoBhkFlats= 600;
		apartment3.noOfThreeBhkFlats=180;
		
		System.out.println("ApartmentId is " + apartment3.apartmentId);
		System.out.println("Apartment name is " + apartment3.apartmentName);
		System.out.println("Apartment location is " + apartment3.location);
		System.out.println("Apartment no of floors is " + apartment3.noOfFloors);
		System.out.println("Apartment no of two bhk flats is " + apartment3.noOfTwoBhkFlats);
		System.out.println("Apartment no of three bhk flats is " + apartment3.noOfThreeBhkFlats);
		apartment3.provideAccomadation();
		
		System.out.println("#########################################################");
		Apartment apartment4 = new Apartment();
		apartment4.apartmentId =10;
		apartment4.apartmentName="Prestige";
		apartment4.location ="yashwanthpur";
		apartment4.noOfFloors=40;
		apartment4.noOfTwoBhkFlats= 520;
		apartment4.noOfThreeBhkFlats=180;
		
		System.out.println("ApartmentId is " + apartment4.apartmentId);
		System.out.println("Apartment name is " + apartment4.apartmentName);
		System.out.println("Apartment location is " + apartment4.location);
		System.out.println("Apartment no of floors is " + apartment4.noOfFloors);
		System.out.println("Apartment no of two bhk flats is " + apartment4.noOfTwoBhkFlats);
		System.out.println("Apartment no of three bhk flats is " + apartment4.noOfThreeBhkFlats);
		apartment4.provideAccomadation();
		
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Apartment apartment5 = new Apartment();
		apartment5.apartmentId =8;
		apartment5.apartmentName="Prestige";
		apartment5.location ="peenya";
		apartment5.noOfFloors=120;
		apartment5.noOfTwoBhkFlats= 20;
		apartment5.noOfThreeBhkFlats=80;
		
		System.out.println("ApartmentId is " + apartment5.apartmentId);
		System.out.println("Apartment name is " + apartment5.apartmentName);
		System.out.println("Apartment location is " + apartment5.location);
		System.out.println("Apartment no of floors is " + apartment5.noOfFloors);
		System.out.println("Apartment no of two bhk flats is " + apartment5.noOfTwoBhkFlats);
		System.out.println("Apartment no of three bhk flats is " + apartment5.noOfThreeBhkFlats);
		apartment5.provideAccomadation();
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
	}
}