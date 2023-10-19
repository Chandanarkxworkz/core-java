package com.xworkz.dmart.products;

import com.xworkz.dmart.Product;
import com.xworkz.dmart.exe.Dmart;

import java.util.Scanner;

public class ProductExecutor {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the no of products");
            int size = scanner.nextInt();
            Dmart dmart = new Dmart(size);

            for (int index = 0; index < size; index++) {
                Product product = new Product();
                //System.out.println("enter the product id : ");
                //product.setProductId(scanner.nextInt());
                System.out.println("enter the product name");
                product.setProductName(scanner.next());
                System.out.println("enter the price");
                product.setPrice(scanner.nextDouble());
                System.out.println("enter the category");
                product.setCategory(scanner.next());
                System.out.println("enter the description ");
                product.setDescription(scanner.next());
                System.out.println("enter the quantity in stock ");
                product.setQuantityInStock(scanner.nextInt());
                System.out.println("enter the manufacturer ");
                product.setManufacturer(scanner.next());
                System.out.println("enter the supplier ");
                product.setSupplier(scanner.next());
                System.out.println("enter the barcode ");
                product.setBarcode(scanner.next());

                dmart.addProducts(product);
            }
            String input=null;

            do {
                System.out.println("press 1 : to get all products");
                System.out.println("press 2 : to get Product By Name");
                System.out.println("press 3 : to get Product By Id");
                System.out.println("press 4 : to get Product By Product Name");
                System.out.println("press 5 : to get Product Name By Barcode");
                System.out.println("press 6 : to get Supplier By Name");
                System.out.println("press 7 : to get Price By Name");
                System.out.println("press 8 : to get Manufacturer By Name");
                System.out.println("press 9 : to get All New Product");


                int options = scanner.nextInt();

                switch (options) {
                    case 1:
                        System.out.println("enter all products ");
                        dmart.getAllProducts();
                        break;

                    case 2:
                        System.out.println("enter get Product By Name ");
                        Product product1 = dmart.getProductByName(scanner.next());
                        System.out.println(product1.getProductId() + " " + product1.getProductName() + " " + product1.getPrice() + " " + product1.getQuantityInStock() + " " + product1.getBarcode() + " " + product1.getManufacturer() + " " + product1.getDescription() + " " + product1.getQuantityInStock() + " " + product1.getCategory());
                        break;

                    case 3:
                        System.out.println("enter get Product By Id ");
                        Product product2 = dmart.getProductById(scanner.nextInt());
                        System.out.println(product2.getProductId() + " " + product2.getProductName() + " " + product2.getPrice() + " " + product2.getQuantityInStock() + " " + product2.getBarcode() + " " + product2.getManufacturer() + " " + product2.getDescription() + " " + product2.getQuantityInStock() + " " + product2.getCategory());
                        break;

                    case 4:
                        System.out.println("enter get Product By Product Name ");
                        Product product3 = dmart.getProductByProductName(scanner.next());
                        System.out.println(product3.getProductId() + " " + product3.getProductName() + " " + product3.getPrice() + " " + product3.getQuantityInStock() + " " + product3.getBarcode() + " " + product3.getManufacturer() + " " + product3.getDescription() + " " + product3.getQuantityInStock() + " " + product3.getCategory());


                        break;

                    case 5:
                        System.out.println("enter get Product Name By Barcode ");
                        String productName = dmart.getProductNameByBarcode(scanner.next());
                        System.out.println(productName);
                        break;

                    case 6:
                        System.out.println("enter get Supplier By Name ");
                        String supplier = dmart.getSupplierByName(scanner.next());
                        System.out.println(supplier);
                        break;

                    case 7:
                        System.out.println("enter get Price By Name ");
                        double price = dmart.getPriceByName(scanner.next());
                        System.out.println(price);

                        break;

                    case 8:
                        System.out.println("enter get Manufacturer By Name ");
                        String manufacturer = dmart.getManufacturerByName(scanner.next());
                        System.out.println(manufacturer);
                        break;

                /*case 9:
                    System.out.println("enter getAllNewProduct ");
                    Product dmart.getAllNewProduct(scanner.next());
                    break;*/


                }

                System.out.println("do you want to continue yes/no");
                input = scanner.next();

            }

            while (input.equals("yes"));
            System.out.println("thank you ........");
        }



    }




        /*Application application1=new Application();
        application1.setAppId(2);
        application1.setAppName("facebook");
        application1.setCompanyName("meta");
        application1.setReleaseDate("12/06/2015");
        application1.setAppType("online social media");
        application1.setSizeInMb (30.0);
        application1.setAppVersion("2.5");

/*       Application application1= Application.builder().appId(1).appName("facebook").companyName("meta").appVersion("2.5").releaseDate("12/06/2015").appType("online social media").sizeInMb(30.0).build();
        Application application1= Application.builder().appId(2).appName("candy crush").companyName("king.com limited").appVersion("3 puzzle").releaseDate("12/04/2012").appType("tile matching").sizeInMb(27.6).build();*/
        /*System.out.println(application.getAppId());
        System.out.println(application.getAppName());
        System.out.println(application.getCompanyName());
        System.out.println(application.getReleaseDate());
        System.out.println(application.getAppType());
        System.out.println(application.getSizeInMb());
        System.out.println(application.getAppVersion());

        System.out.println(application1.getAppId());
        System.out.println(application1.getAppName());
        System.out.println(application1.getCompanyName());
        System.out.println(application1.getReleaseDate());
        System.out.println(application1.getAppType());
        System.out.println(application1.getSizeInMb());
        System.out.println(application1.getAppVersion());

        SoftwareHub softwareHub = new SoftwareHub();
        softwareHub.addApplications(application);
        softwareHub.addApplications(application1);*/





    //softwareHub.updateAppVersionByAppName("27.9","candy crush");
    //softwareHub.getAllApplication();



    //  softwareHub.deleteApplicationByAppName("candy crush");
//        softwareHub.getAllApplication();

//        softwareHub1.deleteApplicationByAppName("facebook");
//        softwareHub1.getAllApplication();

        /*Application application4 = softwareHub.getApplicationByName("facebook");
        System.out.println(application4);
        if(application4!=null) {
            System.out.println(application4.getAppId() + " " + application4.getAppName() + " " + application4.getSizeInMb() + " " + application4.getCompanyName() + " " + application4.getReleaseDate() + " " + application4.getAppVersion() + " " + application4.getAppType());
        }

        Application app2= softwareHub.getApplicationById(1);
        if(app2!=null) {
            System.out.println(app2.getAppId() + " " + app2.getAppName() + " " + app2.getSizeInMb() + " " + app2.getCompanyName() + " " + app2.getReleaseDate() + " " + app2.getAppVersion() + " " + app2.getAppType());
        }
        Application app3= softwareHub.getApplicationById(2);
        if(app3!=null) {
            System.out.println(app3.getAppId() + " " + app3.getAppName() + " " + app3.getSizeInMb() + " " + app3.getCompanyName() + " " + app3.getReleaseDate() + " " + app3.getAppVersion() + " " + app3.getAppType());
        }
        Application app4= softwareHub.getApplicationByAppType("tile matching");
        if(app4!=null) {
            System.out.println(app4.getAppId() + " " + app4.getAppName() + " " + app4.getSizeInMb() + " " + app4.getCompanyName() + " " + app4.getReleaseDate() + " " + app4.getAppVersion() + " " + app4.getAppType());
        }
        Application app5= softwareHub.getApplicationByAppType("online social media");
        if(app5!=null) {
            System.out.println(app5.getAppId() + " " + app5.getAppName() + " " + app5.getSizeInMb() + " " + app5.getCompanyName() + " " + app5.getReleaseDate() + " " + app5.getAppVersion() + " " + app5.getAppType());
        }
        String appName= softwareHub.getApplicationNameByType("tile matching");
        if(appName!=null) {
            System.out.println(appName);
        }

        String appName1= softwareHub.getApplicationNameByType("online social media");
        if(appName1!=null) {
            System.out.println(appName1);
        }

        String appType= softwareHub.getApplicationTypeByName("candy crush");
        if(appType!=null) {
            System.out.println(appType);
        }

        String appType1= softwareHub.getApplicationTypeByName("facebook");
        if(appType1!=null) {
            System.out.println(appType1);
        }

        double sizeInMb= softwareHub.getApplicationSizeByName("candy crush");
        if(sizeInMb!=0) {
            System.out.println(sizeInMb);
        }

        double sizeInMb1= softwareHub.getApplicationSizeByName("facebook");
        if(sizeInMb1!=0) {
            System.out.println(sizeInMb1);
        }

        String companyName= softwareHub.getApplicationCompanyNameByName("candy crush");
            if(companyName!=null) {
                System.out.println(companyName);
            }

        String companyName1= softwareHub.getApplicationCompanyNameByName("facebook");
                if(companyName1!=null) {
                    System.out.println("Application company name is feteching by the application name : " + companyName1);
                }*/








    //
//



