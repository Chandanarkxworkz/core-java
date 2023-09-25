class Application {
 private String name;
 private double sizeInMb ;
 private String version;
 private String ratings;
 private String noOfDownloads;
 private String companyName;
  // default constructor
  public Application(){
  }
  //setter
  public void setName(String name){
  this.name =name;
  }
  //getter
  public String getName(){
  return name;
  }
  //setter
  public void setSizeInMb(double sizeInMb){
  this.sizeInMb =sizeInMb;
  }
  //getter
  public double getSizeInMb(){
  return sizeInMb;
  }
  //setter
  public void setVersion(String version){
  this.version =version;
  }
  //getter
  public String getVersion(){
  return version;
  }
  //setter
  public void setRatings(String ratings){
  this.ratings =ratings;
  }
  //getter
  public String getRatings(){
  return ratings;
  }
  //setter
  public void setNoOfDownloads(String noOfDownloads){
  this.noOfDownloads =noOfDownloads;
  }
  //getter
  public String getNoOfDownloads(){
  return noOfDownloads;
  }
  //setter
  public void setCompanyName(String companyName){
  this.companyName =companyName;
  }
  //getter
  public String getCompanyName(){
  return companyName;
  }
  }