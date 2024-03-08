package com.example.kiemtragiuakyb1.model;

import javax.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private String sex;
    private String date;
    private String address;
    private String phoneNumber;
    private String email;
    private String part;
    private String position;
    private double wage;
    private String startDate;
    private String status;
    private String insurance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public Staff(long id, String name, int age, String sex, String date, String address, String phoneNumber, String email, String part, String position, double wage, String startDate, String status, String insurance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.date = date;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.part = part;
        this.position = position;
        this.wage = wage;
        this.startDate = startDate;
        this.status = status;
        this.insurance = insurance;
    }

    public Staff(String name, int age, String sex, String date, String address, String phoneNumber, String email, String part, String position, double wage, String startDate, String status, String insurance) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.date = date;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.part = part;
        this.position = position;
        this.wage = wage;
        this.startDate = startDate;
        this.status = status;
        this.insurance = insurance;
    }

    public Staff() {
    }
}
