package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerManager implements Serializable{
    public static List<Customer> customerList = new ArrayList<>();

    public static void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public static void removeCustomer(String name){
        customerList.removeIf(customer -> customer.getName().equals(name));
    }
    public static void displayCustomer(){
        for (Customer customer: customerList
             ) {
            System.out.println(customer);
        }
    }
    public static void saveCustomer(){
        try {
            File file = new File("customer.dat");
            FileOutputStream fileOutputStream = new FileOutputStream("customer.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(customerList);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static List<Customer> readCustomer(){
        try {
            FileInputStream fileInputStream = new FileInputStream("customer.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Customer> customerList1 = (List<Customer>)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            return customerList1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
