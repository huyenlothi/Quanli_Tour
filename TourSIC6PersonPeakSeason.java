package com.company;

import java.io.Serializable;

public class TourSIC6PersonPeakSeason extends Tour implements Serializable {
    private double price;

    public TourSIC6PersonPeakSeason(double price) {
        this.price = price;
    }

    public TourSIC6PersonPeakSeason(String tourCode, String tourName, int tourTime, String tourInfomation, String tourStyle, double price) {
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
