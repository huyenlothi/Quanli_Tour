package com.company;

import java.io.*;
import java.util.*;

public class TourManager implements Serializable {
    public static List<Tour> tourList = new ArrayList<>();

    public static void addTour(Tour tour) {
        tourList.add(tour);
    }

    public static void editTour(String name) {
        for (Tour tour : tourList
        ) {
            if (tour.getTourName().equals(name)) {
                Scanner scanner = new Scanner(System.in);
                int i = 1;
                while (i < 6) {
                    System.out.println("menu edit:");
                    System.out.println("1.edit tour name");
                    System.out.println("2.edit tour time");
                    System.out.println("3.edit tour information");
                    System.out.println("4.edit tour style");
                    System.out.println("5.exit");
                    System.out.println("your choose:");
                    int choose = scanner.nextInt();
                    scanner.nextLine();
                    switch (choose) {
                        case 1:
                            System.out.println("enter new tour name");
                            String tourName = scanner.nextLine();
                            tour.setTourName(tourName);
                            i = 2;
                            break;
                        case 2:
                            System.out.println("enter new tour time");
                            int tourTime = scanner.nextInt();
                            scanner.nextLine();
                            tour.setTourTime(tourTime);
                            i = 3;
                            break;
                        case 3:
                            System.out.println("enter new tour information");
                            String tourInformation = scanner.nextLine();
                            tour.setTourInfomation(tourInformation);
                            i = 4;
                            break;
                        case 4:
                            System.out.println("enter new tour style");
                            String tourStyle = scanner.nextLine();
                            tour.setTourStyle(tourStyle);
                            i = 5;
                            break;
                        case 5:
                            System.out.println("tour information was change");
                            i = 6;
                            break;
                    }
                }
            }
        }
    }

    public static void removeTour(String name) {
        tourList.removeIf(tour -> tour.getTourName().equals(name));
    }

    public static void displayTour() {
        for (Tour tour : tourList
        ) {
            System.out.println(tour.toString());
        }
    }

    public static void sortTour() {
        Collections.sort(tourList, new Comparator<Tour>() {
                    @Override
                    public int compare(Tour o1, Tour o2) {
                        if (o1.getpriceTour() > o2.getpriceTour()) {
                            return 1;
                        } else if (o1.getpriceTour() < o2.getpriceTour()) {
                            return -1;
                        } else
                            return 0;
                    }
                }
        );
    }

    public static void saveTour() {
        try {
            File file = new File("tour.dat");
            FileOutputStream fileOutputStream = new FileOutputStream("tour.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(tourList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Tour> readTour() {
        try {
            FileInputStream fileInputStream = new FileInputStream("tour.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Tour> tourList1 = (List<Tour>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return tourList1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
