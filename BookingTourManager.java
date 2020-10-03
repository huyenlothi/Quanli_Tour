package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookingTourManager implements Serializable{
    public static List<BookingTour> bookingTourList= new ArrayList<>();

    public static void addBookingTour(BookingTour bookingTour){
        bookingTourList.add(bookingTour);
    }
    public static void removeBookingTour(String name){
        for (BookingTour bookingTour: bookingTourList
             ) {
            if(bookingTour.getCustomerName().equals(name)){
                bookingTourList.remove(bookingTour);
            }
        }
    }
    public static void displayBookingTour(){
        for (BookingTour bookingTour: bookingTourList
             ) {
            System.out.println(bookingTour.toString());
        }
    }
    public static double getBookingReport() {
        double result=0;
        for (BookingTour bookingTour: bookingTourList
             ) {
            result += bookingTour.getTotalPrice();
        }
        return result;
    }
    public static void seachBookingTour(String name){
        for (BookingTour bookingTour: bookingTourList
             ) {
            if(bookingTour.getCustomerName().equals(name)){
                System.out.println(bookingTour.toString());
            }
        }
    }
    public static void saveBookingTour(){
        try {
            File file = new File("bookingTour.dat");
            FileOutputStream fileOutputStream= new FileOutputStream("bookingTour.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(bookingTourList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<BookingTour> readBookingTour(){
        try {
            FileInputStream fileInputStream = new FileInputStream("bookingTour.dat");
            ObjectInputStream objectInputStream= new ObjectInputStream(fileInputStream);
            List<BookingTour> bookingTourList1 = (List<BookingTour>)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return bookingTourList1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
