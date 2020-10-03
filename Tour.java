package com.company;

public abstract class  Tour {
    private String tourCode;
    private String tourName;
    private int tourTime;
    private String tourInfomation;
    private String tourStyle;

    public Tour() {
    }

    public Tour(String tourCode, String tourName, int tourTime, String tourInfomation, String tourStyle) {
        this.tourCode = tourCode;
        this.tourName = tourName;
        this.tourTime = tourTime;
        this.tourInfomation = tourInfomation;
        this.tourStyle = tourStyle;
    }

    public String getTourCode() {
        return tourCode;
    }

    public void setTourCode(String tourCode) {
        this.tourCode = tourCode;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public int getTourTime() {
        return tourTime;
    }

    public void setTourTime(int tourTime) {
        this.tourTime = tourTime;
    }

    public String getTourInfomation() {
        return tourInfomation;
    }

    public void setTourInfomation(String tourInfomation) {
        this.tourInfomation = tourInfomation;
    }

    public String getTourStyle() {
        return tourStyle;
    }

    public void setTourStyle(String tourStyle) {
        this.tourStyle = tourStyle;
    }

    public abstract double getpriceTour();


    @Override
    public String toString() {
        return "Tour{" +
                "tourCode='" + tourCode + '\'' +
                ", tourName='" + tourName + '\'' +
                ", tourTime=" + tourTime +
                ", tourInfomation='" + tourInfomation + '\'' +
                ", tourStyle='" + tourStyle + '\'' +
                '}';
    }
}
