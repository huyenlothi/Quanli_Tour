package com.company;

import java.io.Serializable;

public class BookingTour implements Serializable {
    private long codeBooking;
    private String tourDate;
    private String customerName;
    private String customerAddress;
    private String cheekInDay;

    private String CheekOutDay;
    private double totalPrice;

    public BookingTour(long codeBooking, String tourDate, String customerName, String customerAddress, String cheekInDay, String cheekOutDay, double totalPrice) {
        this.codeBooking = codeBooking;
        this.tourDate = tourDate;
        this.customerName = customerName;

        this.customerAddress = customerAddress;
        this.cheekInDay = cheekInDay;
        CheekOutDay = cheekOutDay;
        this.totalPrice = totalPrice;
    }

    public long getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(long codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getTourDate() {
        return tourDate;
    }

    public void setTourDate(String tourDate) {
        this.tourDate = tourDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCheekInDay() {
        return cheekInDay;
    }

    public void setCheekInDay(String cheekInDay) {
        this.cheekInDay = cheekInDay;
    }

    public String getCheekOutDay() {
        return CheekOutDay;
    }

    public void setCheekOutDay(String cheekOutDay) {
        CheekOutDay = cheekOutDay;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "BookingTour{" +
                "codeBooking=" + codeBooking +
                ", tourDate='" + tourDate + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", cheekInDay='" + cheekInDay + '\'' +
                ", CheekOutDay='" + CheekOutDay + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
