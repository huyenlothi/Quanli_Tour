package com.company;

import java.io.Serializable;

public class PrivateTour6PersonLowSeason extends Tour implements Serializable {
    private double price;

    public PrivateTour6PersonLowSeason(double price) {
        this.price = price;
    }

    public PrivateTour6PersonLowSeason(String tourCode, String tourName, int tourTime, String tourInfomation, String tourStyle, double price) {
        super(tourCode, tourName, tourTime, tourInfomation, tourStyle);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getpriceTour() {
        return this.getPrice();
    }
}
