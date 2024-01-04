package models;

import java.util.Arrays;

public class Order {


    String Name;
    String PhoneNumber;
    int[] Items;
    double[] Prices;

    public Order(String name, String phoneNumber, int[] items, double[] prices) {
        this.Name = name;
        this.PhoneNumber = phoneNumber;
        this.Items = items;
        this.Prices = prices;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    public int[] getItems() {
        return Items;
    }

    public void setItems(int[] items) {
        this.Items = items;
    }

    public double[] getPrices() {
        return Prices;
    }

    public void setPrices(double[] prices) {
        this.Prices = prices;
    }

    public void VAT() {
        double totalPrice = 0;
        for (double price : Prices) {
            totalPrice += price;
        }
        double vat = totalPrice * 0.13;
        System.out.println("Order details: ");
        System.out.println("Name: " + Name);
        System.out.println("Phone number: " + PhoneNumber);
        System.out.println("Items: " + Arrays.toString(Items));
        System.out.println("Prices: " + Arrays.toString(Prices));
        System.out.println("Total price: " + totalPrice);
        System.out.println("VAT: " + vat);
        System.out.println("Total price with VAT: " + (totalPrice + vat));
    }
}

