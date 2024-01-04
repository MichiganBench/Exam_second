package models;

import java.util.Arrays;

public class Tshirts {

    String Name;
    int Product_code;
    double Price;
    String Brand;
    String Description;
    String [] Sizes;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getProduct_code() {
        return Product_code;
    }

    public void setProduct_code(int product_code) {
        this.Product_code = product_code;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription() {
        this.Description = Description;
    }

    public String[] getSizes() {
        return Sizes;
    }

    public void setSizes(String[] sizes) {
        this.Sizes = sizes;
    }

    public Tshirts(String name, int product_code, double price, String brand, String description, String[] sizes) {
        this.Name = name;
        this.Product_code = product_code;
        this.Price = price;
        this.Brand = brand;
        this.Description = description;
        this.Sizes = sizes;
    }





    public void Description (){
        System.out.println("Item name:" + Name);
        System.out.println("Description:" + Description);
        System.out.println("Product code:" + Product_code);
        System.out.println("Price:" + Price);
        System.out.println("Sizes:" + Arrays.toString(Sizes));
    }




}


