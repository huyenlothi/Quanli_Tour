package com.company;

import java.io.Serializable;

public class TourSIC6PersonLowSeason extends Tour implements Serializable {
    private double price;

    public TourSIC6PersonLowSeason(double price) {
        this.price = price;
    }

    public TourSIC6PersonLowSeason(String tourCode, String tourName, int tourTime, String tourInfomation, String tourStyle, double price) {
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
