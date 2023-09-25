class JvmExecutor{
	public static void main(String[] dependent){
	
		
	
	JVM jvm=new JVM();
	jvm.setPurpose("which provides runtime environment for bytecode");
	jvm.setVersion("java 21");
	jvm.setPlatform("Jvm platform-dependent");
		
	Java1 java=new Java1();
	java.jvm=jvm;
	java.hostCompanyName="Tcs";
	System.out.println("------------------------------------------------------------------------");							
	System.out.println("Hosting Company Name : "+java.hostCompanyName);
	System.out.println("Purpose : "+java.jvm.getPurpose());
	System.out.println("Version : "+java.jvm.getVersion());
	System.out.println("Platfrom : "+java.jvm.getPlatform());
	System.out.println("------------------------------------------------------------------------");							
	}
}