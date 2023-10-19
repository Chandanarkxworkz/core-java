package com.xworkz.dmart.exe;

import com.xworkz.dmart.Product;

import java.util.Arrays;

public class Dmart {
    Product product[];

    public Dmart(int size) {
        product = new Product[size];
    }
    int index;
    int id=2;

    public boolean addProducts(Product product) {
        System.out.println("invoking add products");
        System.out.println(product);
        boolean isAdded = false;
        if (product != null) {
            product.setProductId(id++);
            this.product[index++] = product;
            isAdded = true;
        }
        return isAdded;
    }

    public void getAllProducts() {
        System.out.println("list of products details are ");
        for (int index = 0; index < product.length; index++) {
            System.out.println((product[index]));
            if (product[index] != null) {
                System.out.println(product[index].getProductId() + " " + product[index].getProductName() + " " + product[index].getPrice() + " " + product[index].getCategory() + " " + product[index].getDescription() + " " + product[index].getQuantityInStock() + " " + product[index].getManufacturer() + " " + product[index].getSupplier() + " " + product[index].getBarcode() );
            }
        }
    }

    public Product getProductByName(String productName) {
        Product product1 = null;

        System.out.println("invoking the  product by name method " + productName);


        for (int proIndex = 0; proIndex < product.length; proIndex++) {
            System.out.println(product[proIndex]);

                if (product[proIndex].getProductName().equals(productName)) {
                    product1 = product[proIndex];


                }
            }
        return product1;
        }






    public Product getProductById(int productId) {
        Product product2 = null;
        System.out.println("invoking the product by id method ");
        for (int proIndex = 0; proIndex < this.product.length; proIndex++) {

                if (product[proIndex].getProductId() == productId) {
                    product2 = product[proIndex];
                    System.out.println(" product found by id .... please collect in the executor  ");
                }
            }
        return product2;
        }




    public Product getProductByProductName(String productName) {
        Product product3 = null;
        System.out.println("invoking the product  by product name method " + productName);
        for (int proIndex = 0; proIndex < product.length; proIndex++) {

                if (product[proIndex].getProductName().equals(productName)) {
                    product3 = product[proIndex];

                }
            }
        return product3;
        }



    public String getProductNameByBarcode(String barcode) {

        String productName = null;
        System.out.println("invoking the product name by barcode method ");
        for (int proIndex = 0; proIndex < this.product.length; proIndex++) {
            if (product[proIndex] != null) {
                if (product[proIndex].getBarcode().equals(barcode)) {
                    productName = product[proIndex].getProductName();
                    System.out.println(" product name found by barcode .... please collect in the executor  ");
                }
            }
        }
        return productName;
    }

    public String getSupplierByName(String productName) {
        String supplier = null;
        System.out.println("invoking the supplier by name method ");
        for (int proIndex = 0; proIndex < this.product.length; proIndex++) {
            if (product[proIndex] != null) {
                if (product[proIndex].getProductName().equals(productName)) {
                    supplier = product[proIndex].getSupplier();
                    System.out.println(" supplier found by name .... please collect in the executor  ");
                }
            }
        }
        return supplier;
    }

    public double getPriceByName(String productName) {
        double price = 0.0;
        System.out.println("invoking the product price by name method " );
        for (int proIndex = 0; proIndex < this.product.length; proIndex++) {

                if (product[proIndex].getProductName().equals(productName)) {
                    price = product[proIndex].getPrice();
                    System.out.println(" product price found by name .... please collect in the executor  " );
                }
            }
        return price;
        }


    public String getManufacturerByName(String name) {
        String manufacturer = null;
        System.out.println("invoking the manufacturer found by name method ");
        for (int proIndex = 0; proIndex < this.product.length; proIndex++) {
            if (product[proIndex] != null) {
                if (product[proIndex].getProductName().equals(name)) {
                    manufacturer = product[proIndex].getManufacturer();
                    System.out.println("Application company name found by name .... please collect in the executor  ");
                }
            }
        }
        return manufacturer;
    }


    public boolean updateCategoryByProductName(String updatedCategory, String existingProductName) {
        boolean isCategoryUpdated = false;
        System.out.println("invoking category by product name method");
        for (int proIndex = 0; proIndex < this.product.length; proIndex++) {
            if (product[proIndex] != null)
                if (product[proIndex].getProductName() == existingProductName) {
                    product[proIndex].setCategory(updatedCategory);
                    isCategoryUpdated = true;

                    System.out.println("updated category by product name .... please collect in the executor  ");
                }
        }


        return isCategoryUpdated;

    }


    public boolean updateProductNameById(String updatedProductName, int existingId) {
        boolean isProductNameUpdated = false;
        System.out.println("invoking update product name by id method");
        for (int proIndex = 0; proIndex < this.product.length; proIndex++) {
            if (product[proIndex] != null)
                if (product[proIndex].getProductId() == existingId) {
                    product[proIndex].setProductName(updatedProductName);
                    isProductNameUpdated = true;

                    System.out.println("updated product name by Id .... please collect in the executor  ");
                }


        }


        return isProductNameUpdated;
    }





    private void getAllNewProduct(Product product[]){

        System.out.println("list of new app post delete");
        for (int proIndex = 0; proIndex < product.length;proIndex++) {

            System.out.println(product[proIndex].getProductId() + " " + product[proIndex].getProductName() + " " + product[proIndex].getPrice() + " " + product[proIndex].getCategory() + " " + product[proIndex].getDescription() + " " + product[proIndex].getQuantityInStock() + " " + product[proIndex].getManufacturer() + " " + product[proIndex].getSupplier() + " " + product[proIndex].getBarcode() );

        }
    }
    public boolean deleteProductByProductName(String productName) {
        boolean isProductDeleted = false;
        System.out.println("invoking deleteProductByProductName");
        int proIndex, newIndex;

        for (proIndex = 0, newIndex = 0; proIndex < this.product.length; proIndex++) {

            if (product[proIndex].getProductName() != productName) {
                product[newIndex++] = product[proIndex];
                System.out.println("given product name deleted");
                isProductDeleted=true;

            }
        }
      product = Arrays.copyOf(product, newIndex);
        getAllNewProduct(product);

        return isProductDeleted;
    }


}







