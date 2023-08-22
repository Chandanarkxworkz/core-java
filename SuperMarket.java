class SuperMarket {
	static String fruits[] = {"Apple", "Banana", "Orange", "Grapes", "Watermelon","Mango", "Strawberry", "Pineapple", "Kiwi", "Pear","peach","blueberry","raspberry","blackberry"};
	static String cereals[] = {"wheat", "rye", "sorghum", "rice, oats", "maize", "barley", "millet", "quinoa","corn","Frosted Flakes","Lucky Charms","Cheerios","Froot Loops","Cinnamon Toast Crunch"};
	static String toothpaste[] = {"Minty Fresh","Sparkling Clean","Whitening Wonder","Cinnamon Burst","Gentle Care","Citrus Splash","Enamel Shield","Cool Mint Gel","Herbal Fusion","Deep Clean","Fresh Breath","Pure White","Power Mint","Lemon Zest","Ocean Breeze"};
	static String shampoo[] = {"L'Oreal Paris Extraordinary Oil Shampoo","Pantene Pro-V Daily Moisture Renewal Shampoo","Herbal Essences Hello Hydration Shampoo","Head & Shoulders Classic Clean Shampoo","Dove Nutritive Solutions Intensive Repair Shampoo","Aveeno Apple Cider Vinegar Blend Shampoo","Garnier Fructis Sleek & Shine Shampoo","TRESemmé Moisture Rich Shampoo","OGX Moroccan Argan Oil Shampoo","Neutrogena Anti-Residue Clarifying Shampoo","clinic plus","tresemme","himalaya","meera","clear"};
	static String beverages[] = {"Water","Coffee","Tea","Orange Juice","Lemonade","Soda","Iced Tea","Hot Chocolate","Milk","Smoothie","wine","cocktail","beer","cola","mojito"};
	static String cleaningSupplies[] = {"Broom","Mop","Vacuum Cleaner","Dustpan","Sponges","Microfiber Cloths","All-Purpose Cleaner","Window Cleaner","Disinfecting Wipes","Scrub Brush","duster","buckets","cleaning solutions","dish soap","trash bags"};
	static String personalCareProducts [] = {"Toothpaste","Shampoo","Conditioner","Soap","Deodorant","Body Lotion","Razor","Face Cleanser","Sunscreen","Perfume","body wash","cologne","floss","hair gel","shaving cream"};
	static String bakeryItems[] = {"Bread","Croissant","Muffin","Danish Pastry","Bagel","Cupcake","Eclair","Pretzel","Scone","Cinnamon Roll","chips","biscuit","pie","donut","cake"};
	static String householdEssentials[] = {"Toilet Paper","Paper Towels","Trash Bags","Laundry Detergent","Dish Soap","Batteries","Light Bulbs","Hand Soap","Aluminum Foil","Cleaning Gloves","candles","first aid kit","plastic wrap","aluminum foil","tissues"};
	static String cookies[] = {"Chocolate Chip Cookie","Oatmeal Raisin Cookie","Snickerdoodle","Peanut Butter Cookie","Sugar Cookie","Double Chocolate Cookie","Macadamia Nut Cookie","Gingerbread Cookie","Shortbread Cookie","White Chocolate Macadamia Nut Cookie","coconut macaroon","thumbprint","lemon","almond","molasses"};
		public static void main(String SuperMarket[]){
			System.out.println("main started");
		getFruits();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getReversedFruits();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getCereals();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getReversedCereals();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getToothpaste();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getReversedToothpaste();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getShampoo();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getReversedShampoo();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getBeverages();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getReversedBeverages();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getCleaningSupplies();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getReversedCleaningSupplies();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getPersonalCareProducts();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getReversedPersonalCareProducts();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getBakeryItems();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getReversedBakeryItems();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getHouseholdEssentials();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getReversedHouseholdEssentials();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getCookies();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
		getReversedCookies();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("main ended");
		}
			public static void getFruits(){
			
			System.out.println("original order: ");
			System.out.println("the available fruits are " );
			for ( int index = 0 ; index < fruits.length; index++){
			System.out.println("the fruits  are " + fruits[index]);
	        }
			}
			public static void getReversedFruits(){
			System.out.println("reversed order: ");
			System.out.println("the available fruits are " );
			for ( int index = fruits.length - 1; index >=0 ; index--){
			System.out.println("the fruits are " + fruits[index]);
	        }
			}
			public static void getCereals(){
				
			System.out.println("original order: ");
			System.out.println("the available cereals are " );
			for ( int index = 0 ; index < cereals.length; index++){
			System.out.println("the cereals  are " + cereals[index]);
			}
			}
			public static void getReversedCereals(){
			System.out.println("reversed order: ");
			System.out.println("the available cereals are " );
			for ( int index = cereals.length - 1; index >=0 ; index--){
			System.out.println("the cereals  are " + cereals[index]);
	        }
			}
			public static void getToothpaste(){
				
			System.out.println("original order: ");
			System.out.println("the available toothpaste are " );
			for ( int index = 0 ; index < toothpaste.length; index++){
			System.out.println("the toothpaste  are " + toothpaste[index]);
			}
			}
			public static void getReversedToothpaste(){
				
			System.out.println("reversed order: ");
			System.out.println("the available toothpaste are " );
			for ( int index = toothpaste.length - 1; index >=0 ; index--){
			System.out.println("the toothpaste are " + toothpaste[index]);
	        }
			}
			public static void getShampoo(){
			System.out.println("original order: ");
			System.out.println("the available shampoo are " );
			for ( int index = 0 ; index < shampoo.length; index++){
			System.out.println("the shampoo are " + shampoo[index]);
			}
			}
			public static void getReversedShampoo(){
			System.out.println("reversed order: ");
			System.out.println("the available shampoo are " );
			for ( int index = shampoo.length - 1; index >=0 ; index--){
			System.out.println("the shampoo are " + shampoo[index]);
	        }
			}
			public static void getBeverages(){
			System.out.println("original order: ");
			System.out.println("the available beverages are " );
			for ( int index = 0 ; index < beverages.length; index++){
			System.out.println("the beverages  are " + beverages[index]);
			}
			}
			public static void getReversedBeverages(){
			System.out.println("reversed order: ");
			System.out.println("the available beverages are " );
			for ( int index = beverages.length - 1; index >=0 ; index--){
			System.out.println("the beverages  are " + beverages[index]);
	        }
			}
			public static void getCleaningSupplies(){
				
			System.out.println("original order: ");
			System.out.println("the available cleaning Supplies are " );
			for ( int index = 0 ; index < cleaningSupplies.length; index++){
			System.out.println("the cleaning Supplies  are " + cleaningSupplies[index]);
	        }
			}
			public static void getReversedCleaningSupplies(){
			System.out.println("reversed order: ");
			System.out.println("the available cleaning Supplies are " );
			for ( int index = cleaningSupplies.length - 1; index >=0 ; index--){
			System.out.println("the cleaning Supplies are " + cleaningSupplies[index]);
	        }
			}
			public static void getPersonalCareProducts(){
				
			System.out.println("original order: ");
			System.out.println("the available personal Care Products are " );
			for ( int index = 0 ; index < personalCareProducts.length; index++){
			System.out.println("the personal Care Products  are " + personalCareProducts[index]);
			}
			}
			public static void getReversedPersonalCareProducts(){
			System.out.println("reversed order: ");
			System.out.println("the available personal Care Products are " );
			for ( int index = personalCareProducts.length - 1; index >=0 ; index--){
			System.out.println("the personal Care Products  are " + personalCareProducts[index]);
	        }
			}
			public static void getBakeryItems(){
				
			System.out.println("original order: ");
			System.out.println("the available bakery Items are " );
			for ( int index = 0 ; index < bakeryItems.length; index++){
			System.out.println("the bakery Items  are " + bakeryItems[index]);
			}
			}
			public static void getReversedBakeryItems(){
			System.out.println("reversed order: ");
			System.out.println("the available bakery Items are " );
			for ( int index = bakeryItems.length - 1; index >=0 ; index--){
			System.out.println("the bakery Items are " + bakeryItems[index]);
	        }
			}
			public static void getHouseholdEssentials(){
				
			System.out.println("original order: ");
			System.out.println("the available household Essentials are " );
			for ( int index = 0 ; index < householdEssentials.length; index++){
			System.out.println("the household Essentials are " + householdEssentials[index]);
			}
			}
			public static void getReversedHouseholdEssentials(){
			System.out.println("reversed order: ");
			System.out.println("the available household Essentials are " );
			for ( int index = householdEssentials.length - 1; index >=0 ; index--){
			System.out.println("the household Essentials are " + householdEssentials[index]);
	        }
			}
			public static void getCookies(){
				
				
			System.out.println("original order: ");
			System.out.println("the available cookies are " );
			for ( int index = 0 ; index < cookies.length; index++){
			System.out.println("the cookies  are " + cookies[index]);
			}
			}
			public static void getReversedCookies(){
			System.out.println("reversed order: ");
			System.out.println("the available cookies are " );
			for ( int index = cookies.length - 1; index >=0 ; index--){
			System.out.println("cookies  are " + cookies[index]);
	        }
			}
				
}
		
