
package com.home;

import java.util.Date;

public class HomeBean {
    private String medicine;
    private int medicine_id;
    private int quantity;
    private Date expiry_date;
    private float price;

    public HomeBean(String medicine, int medicine_id, int quantity, Date expiry_date, float price) {
        this.medicine = medicine;
        this.medicine_id = medicine_id;
        this.quantity = quantity;
        this.expiry_date = expiry_date;
        this.price = price;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getMedicine_id() {
        return medicine_id;
    }

    public void setMedicine_id(int medicine_id) {
        this.medicine_id = medicine_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    Date getexpiry_date() {
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return expiry_date;
         // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
            
}
