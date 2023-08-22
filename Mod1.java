class Mod1{
	public static void main(String Mod[]){
	 int total = Mod (20,30);
	 total = Mod (10,50);
	 total = Mod (80,80);
	 total = Mod (60,70);
	 total = Mod (600,20);
	 total = Mod (60,300);
	 total = Mod (5000,20);
	 total = Mod (10,50);
	 total = Mod (400,1000);
	 total = Mod (500,800);
	 total = Mod (600,20);
	 total = Mod (750,250);
	 total = Mod (800,250);
	 total = Mod (5000,9000);
	 total = Mod (60,80);
	 total = Mod (300,50);
	 total = Mod (850,60);
	 total = Mod (50,80);
	 total = Mod (60,200);
	 total = Mod (900,100);
	 System.out.println("#########################################################");
	 total = Mod (20,30,10);
	 total = Mod (10,50,60);
	 total = Mod (80,80,1000);
	 total = Mod (60,70,200);
	 total = Mod (600,20,3000);
	 total = Mod (60,300,230);
	 total = Mod (5000,20,600);
	 total = Mod (10,50,250);
	 total = Mod (400,1000,250);
	 total = Mod (500,800,490);
	 total = Mod (600,20,350);
	 total = Mod (750,250,600);
	 total = Mod (800,250,560);
	 total = Mod (5000,9000,290);
	 total = Mod (60,80,780);
	 total = Mod (300,50,790);
	 total = Mod (850,60,320);
	 total = Mod (50,80,560);
	 total = Mod (60,200,453);
	 total = Mod (900,100,280);
}
	 public static int Mod(int a,int b){
	 int total =0 ;
	 System.out.println("Mod started");
	 
	 System.out.println("Mod of two number is : ");
	 System.out.println(a%b);
	 
	 System.out.println("Mod ended");
	 return total;
 }
 public static int Mod(int a,int b,int c){
	 int total =0 ;
	 System.out.println("Mod started");
	 
	 System.out.println("Mod of three number is : ");
	 System.out.println(a%b%c);
	 
	 System.out.println("Mod ended");
	 return total;
 }
}