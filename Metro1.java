class Metro1{
	// instan variable
  int metroId;
  int noOfCompartments; //intial instanc varia of class we can use static as but not a goos pract
  String source;
  String destination;
 // instan  condst intia // parameterised variavle
 public Metro1(int metroId, int noOfCompartments,String source,String destination){
	 this.metroId = metroId;//instide constror this.varianame
	 this.noOfCompartments= noOfCompartments;
	 this.source= source;
	 this.destination= destination;//confit b/w instan and parameterized when both as same varia name to overcome this.ambigutive btw because compliler poiint to parameter vaeriable only
 } 
 
 public void displayDetails(){
	 System.out.println("the metro id : " + this.metroId);
	 System.out.println("no Of Compartments is " + this.noOfCompartments);
	 System.out.println("source is " + this.source);
	 System.out.println("destination is " + this.destination);
 }
}//nthis inside constru,method,block