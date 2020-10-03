package com.company;

import java.io.Serializable;

public class Customer implements Serializable {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String Nationality;

    public Customer(String name, String email, String phone, String address, String nationality) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        Nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getNationality() {
        return Nationality;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", Nationality='" + Nationality + '\'' +
                '}';
    }
}
