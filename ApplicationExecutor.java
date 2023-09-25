class ApplicationExecutor{
public static void main(String apps[]){
 Application app = new Application();
 app.setName("phonepe");
 app.setSizeInMb(800);
 app.setVersion("18v");
 app.setRatings("4.6");
 app.setNoOfDownloads("1.7M");
 app.setCompanyName("phonepe");
 PlayStore store = new PlayStore();
 //has a relationship
 store.application = app;
 store.managedBy="google";
 
 System.out.println(store.application.getName());
  System.out.println(store.application.getSizeInMb());
   System.out.println(store.application.getVersion());
    System.out.println(store.application.getRatings());
	 System.out.println(store.application.getNoOfDownloads());
	  System.out.println(store.application.getCompanyName());
 System.out.println(store.managedBy);
 }
 }