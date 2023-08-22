class EatClub{

	public static double search (String foodName ){
	double price = 0.0;
	System.out.println("invoked search : foodName (String)");
	if(foodName == "Biryani"){
	price = 150.60 ;
	return price;
	
	}
	if(foodName == "Hummus"){
	price = 249.20 ;
	return price;
	
	}
	if(foodName == "Shawarma"){
	price = 149.00 ;
	return price;
	
	}
	if(foodName == "Kebabs"){
	price = 100.50 ;
	return price;
	
	}
	if(foodName == "Falafel"){
	price = 150.90;
	return price;
	
	}
	if(foodName == "Samosas"){
	price = 30.75 ;
	return price;
	
	}
	if(foodName == "Couscous"){
	price = 230.00;
	return price;
	
	}
	if(foodName == "Maqluba"){
	price = 225.40;
	return price;
	
	}
	if(foodName == "Harira"){
	price = 110.20;
	return price;
	
	}
	if(foodName == "Dolma"){
	price = 150.90;
	return price;
	
	}
	if(foodName == "Manti"){
	price =230.00;
	return price;
	
	}
	if(foodName == "Nasi Goreng"){
	price =140.10;
	return price;
	
	}
	if(foodName == "Mandi"){
	price = 40.50;
	return price;
	
	}
	if(foodName == "Haleem"){
	price= 60.00;
	return price;
	
	}
	if(foodName == "Tabouleh"){
	price =140.80;
	return price;
	
	}
	if(foodName == "Fatayer"){
	price = 80.00;
	return price;
	
	}
	if(foodName == "Shish Taouk"){
	price = 60.45;
	return price;
	
	}
	if(foodName == "Sambusak"){
	price = 210.80;
	return price;
	
	}
	if(foodName == "Kabsa"){
	price =70.15;
	return price;
	
	}
	if(foodName == "Murtabak"){
	price = 100.50;
	return price;
	
	}
	if(foodName == "Tandoori Chicken"){
	price = 250.60;
	return price;
	
	}
	if(foodName == "Sheer Khurma"){
	price = 360.00;
	return price;
	
	}
	if(foodName == "Gazpacho"){
	price = 250.30;
	return price;
	
	}
	if(foodName == "Seekh Kebabs"){
	price = 180.00;
	return price;
	
	}
	if(foodName == "Aloo Paratha"){
	price = 120.70;
	return price;
	
	}
	if(foodName == "Kunafa"){
	price = 60.00;
	return price;
	
	}
	if(foodName == "Knafeh"){
	price = 125.8;
	return price;
	
	}
	if(foodName == "Jalebi"){
	price =40.30;
	return price;
	
	}
	if(foodName == "Sambal"){
	price = 75.55;
	return price;
	
	}
	if(foodName == "Lahmacun"){
	price = 200.45;
	return price;
	
	}
	if(foodName == "Kibbeh"){
	price = 150.87;
	return price;
	
	}
	if(foodName == "Shawerma"){
	price = 20.19 ;
	return price;
	
	}
	if(foodName == "Tahdig"){
	price = 75.33;
	return price;
	
	}
	if(foodName == "Adana Kebab"){
	price = 175.00;
	return price;
	
	}
	if(foodName == "Pide"){
	price= 60.20;
	return price;
	
	}
	if(foodName == "Harissa"){
	price = 220.00;
	return price;
	
	}
	if(foodName == "Momo"){
	price =100.19;
	return price;
	
	}
	if(foodName == "Fattoush"){
	price = 180.10;
	return price;
	
	}
	if(foodName == "Pastilla"){
	price = 45.0;
	return price;
	
	}
	if(foodName == "Tabbouleh"){
	price = 68.12;
	return price;
	
	}
	if(foodName == "Ghormeh Sabzi"){
	price = 80.90 ;
	return price;
	
	}
	if(foodName == "Ful Medames"){
	price = 90.00;
	return price;
	
	}
	if(foodName == "Mandazi"){
	price = 150.15;
	return price;
	
	}
	if(foodName == "Shorba"){
	price =50.00;
	return price;
	
	}
	if(foodName == "Roti Canai"){
	price = 65.10;
	return price;
	
	}
	if(foodName == "Salmon Roe Fish Tacos"){
	price = 115.00;
	return price;
	
	}
	if(foodName == "Thieboudienne"){
	price = 99.11;
	return price;
	
	}
	if(foodName == "Kunun Gyada"){
	price = 69.60;
	return price;
	
	}
	if(foodName == "Sabzi Polo"){
	price = 96.40;
	return price;
	
	}
	if(foodName == "Nihari"){
	price = 150.00;
	return price;
	
	}
	System.out.println("end of search with 1 parameter");
	return price;
	}
  }

	public static double search (String foodName,int quantity){
	double price = 0.0;
	System.out.println("invoked search : foodName (String), quantity (int)");
	if(foodName == "Biryani"){
	price = 150.60 * quantity ;
	return price;
	
	}
	if(foodName == "Hummus"){
	price = 249.20 * quantity ;
	return price;
	
	}
	if(foodName == "Shawarma"){
	price = 149.00 * quantity ;
	return price;
	
	}
	if(foodName == "Kebabs"){
	price = 100.50 * quantity ;
	return price;
	
	}
	if(foodName == "Falafel"){
	price = 150.90 * quantity;
	return price;
	
	}
	if(foodName == "Samosas"){
	price = 30.75 * quantity ;
	return price;
	
	}
	if(foodName == "Couscous"){
	price = 230.00 * quantity;
	return price;
	
	}
	if(foodName == "Maqluba"){
	price = 225.40 * quantity;
	return price;
	
	}
	if(foodName == "Harira"){
	price = 110.20 * quantity;
	return price;
	
	}
	if(foodName == "Dolma"){
	price = 150.90 * quantity;
	return price;
	
	}
	if(foodName == "Manti"){
	price =230.00 * quantity;
	return price;
	
	}
	if(foodName == "Nasi Goreng"){
	price =140.10 * quantity;
	return price;
	
	}
	if(foodName == "Mandi"){
	price = 40.50 * quantity;
	return price;
	
	}
	if(foodName == "Haleem"){
	price= 60.00 * quantity;
	return price;
	
	}
	if(foodName == "Tabouleh"){
	price =140.80 * quantity;
	return price;
	
	}
	if(foodName == "Fatayer"){
	price = 80.00 * quantity;
	return price;
	
	}
	if(foodName == "Shish Taouk"){
	price = 60.45 * quantity;
	return price;
	
	}
	if(foodName == "Sambusak"){
	price = 210.80 * quantity;
	return price;
	
	}
	if(foodName == "Kabsa"){
	price =70.15 * quantity;
	return price;
	
	}
	if(foodName == "Murtabak"){
	price = 100.50 * quantity;
	return price;
	
	}
	if(foodName == "Tandoori Chicken"){
	price = 250.60* quantity;
	return price;
	
	}
	if(foodName == "Sheer Khurma"){
	price = 360.00 * quantity;
	return price;
	
	}
	if(foodName == "Gazpacho"){
	price = 250.30 * quantity;
	return price;
	
	}
	if(foodName == "Seekh Kebabs"){
	price = 180.00 * quantity;
	return price;
	
	}
	if(foodName == "Aloo Paratha"){
	price = 120.70 * quantity;
	return price;
	
	}
	if(foodName == "Kunafa"){
	price = 60.00 * quantity;
	return price;
	
	}
	if(foodName == "Knafeh"){
	price = 125.8 * quantity;
	return price;
	
	}
	if(foodName == "Jalebi"){
	price =40.30 * quantity;
	return price;
	
	}
	if(foodName == "Sambal"){
	price = 75.55 * quantity;
	return price;
	
	}
	if(foodName == "Lahmacun"){
	price = 200.45 * quantity;
	return price;
	
	}
	if(foodName == "Kibbeh"){
	price = 150.87 * quantity;
	return price;
	
	}
	if(foodName == "Shawerma"){
	price = 20.19 * quantity ;
	return price;
	
	}
	if(foodName == "Tahdig"){
	price = 75.33 * quantity;
	return price;
	
	}
	if(foodName == "Adana Kebab"){
	price = 175.00 * quantity;
	return price;
	
	}
	if(foodName == "Pide"){
	price= 60.20 * quantity;
	return price;
	
	}
	if(foodName == "Harissa"){
	price = 220.00 * quantity;
	return price;
	
	}
	if(foodName == "Momo"){
	price =100.19 * quantity;
	return price;
	
	}
	if(foodName == "Fattoush"){
	price = 180.10 * quantity;
	return price;
	
	}
	if(foodName == "Pastilla"){
	price = 45.0 * quantity;
	return price;
	
	}
	if(foodName == "Tabbouleh"){
	price = 68.12 * quantity;
	return price;
	
	}
	if(foodName == "Ghormeh Sabzi"){
	price = 80.90 * quantity ;
	return price;
	
	}
	if(foodName == "Ful Medames"){
	price = 90.00 * quantity;
	return price;
	
	}
	if(foodName == "Mandazi"){
	price = 150.15 * quantity;
	return price;
	
	}
	if(foodName == "Shorba"){
	price =50.00 * quantity;
	return price;
	
	}
	if(foodName == "Roti Canai"){
	price = 65.10 * quantity;
	return price;
	
	}
	if(foodName == "Salmon Roe Fish Tacos"){
	price = 115.00 * quantity;
	return price;
	
	}
	if(foodName == "Thieboudienne"){
	price = 99.11 * quantity;
	return price;
	
	}
	if(foodName == "Kunun Gyada"){
	price = 69.60 * quantity;
	return price;
	
	}
	if(foodName == "Sabzi Polo"){
	price = 96.40 * quantity;
	return price;
	
	}
	if(foodName == "Nihari"){
	price = 150.00 * quantity;
	return price;
	
	}
	System.out.println("end of search with 2 parameter ");
	return price;
	}
  }
