class PostOfficeExecution{
	 public static void main(String[] post) {
        
        PostOffice postOffice = new PostOffice();

         postOffice.setName("Main Post Office");
        System.out.println("Post Office Name: " + postOffice.getName());
		postOffice.setLocation("belur");
        System.out.println("Post Office Location: " + postOffice.getLocation());
		 postOffice.setPostalWorkers(20);
        System.out.println("Number of Postal Workers: " + postOffice.getPostalWorkers());
		 postOffice.setMailboxes(500);
        System.out.println("Number of Mailboxes: " + postOffice.getMailboxes());
		postOffice.setOpenOnSaturdays(true);
        System.out.println("Open on Saturdays: " + (postOffice.isOpenOnSaturdays() ? "Yes" : "No"));
		}
}