package com.company;

import java.util.Scanner;

public class Main {
public static void menuAdmin(){
    Scanner scanner = new Scanner(System.in);

}
    public static void main(String[] args) {
//        BookingTourManager bookingTourManager = new BookingTourManager();
//        BookingTour b1= new BookingTour(1001,"3/2","Dung","hn","3/4","7/4",5000000);
//        BookingTour b2= new BookingTour(1002,"5/5","chi","hn","9/6","15/6",9000000);
//        BookingTourManager.addBookingTour(b1);
//        BookingTourManager.addBookingTour(b2);
//        BookingTourManager.removeBookingTour("Dung");
//        BookingTourManager.displayBookingTour();
//    Customer c1 = new Customer("toan","toan@gmail.com","09876544","hn","vn");
//    Customer c2 = new Customer("chi","chi@gmail.com","09876556","hn","vn");
//    Customer c3 = new Customer("dung","dung@gmail.com","098764367","hn","vn");
//    CustomerManager.addCustomer(c1);
//    CustomerManager.addCustomer(c2);
//    CustomerManager.addCustomer(c3);
//CustomerManager.displayCustomer();
        Tour t1= new PrivateTour1To5PersonLowSeason("001","sapa",5,"sapa-hg-lc","authentic",5000);
        Tour t2= new PrivateTour1To5PersonLowSeason("002","mucangchai",4,"muacngchai-hg-lc","authentic",5000);
        Tour t3= new PrivateTour1To5PersonLowSeason("003","halong",4,"halong-hg-lc","luxury",7000);

        TourManager.addTour(t1);
        TourManager.addTour(t2);
        TourManager.addTour(t3);
        TourManager.editTour("sapa");
        TourManager.displayTour();
    }
}
