package com.xworkz.crud.constants;

public enum DBProperties {

    URL("jdbc:mysql://localhost:3306/Bank_31_jan_2024"), USER("root"), PASSWORD("root@2024"), DRIVER_PATH("com.mysql.cj.jdbc.Driver");


    public String value;

    private DBProperties(String value) {
        this.value = value;
    }
}
//    DRIVER_PATH("com.mysql.cj.jdbc.Driver");

      //  public String value;

    //    private DBProperties(String value) {
        //    this.value =value;
       // }
   // }

//    URL("jdbc:mysql://localhost:3306/Book_26_jan_2024"), USER("root"), PASSWORD("root@2024"),DRIVER_PATH("com.mysql.cj.jdbc.Driver");
//
//    public String value;
//    private DBProperties(String value) {
//
//        this.value=value;
//    }
//}
