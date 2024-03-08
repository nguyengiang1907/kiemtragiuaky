package com.example.kiemtragiuakyb2.model;

import javax.persistence.*;

@Entity
@Table(name = "computers")
public class Computer  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String manufacturer;
    private String type;
    private String operatingSystem;
    private String CPU;
    private String RAM;
    private String card;
    private String screen;
    private String startDay;
    private String status;
    private double price;
    private String detail;

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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Computer(long id, String name, String manufacturer, String type, String operatingSystem, String CPU, String RAM, String card, String screen, String startDay, String status, double price, String detail) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.CPU = CPU;
        this.RAM = RAM;
        this.card = card;
        this.screen = screen;
        this.startDay = startDay;
        this.status = status;
        this.price = price;
        this.detail = detail;
    }

    public Computer(String name, String manufacturer, String type, String operatingSystem, String CPU, String RAM, String card, String screen, String startDay, String status, double price, String detail) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.CPU = CPU;
        this.RAM = RAM;
        this.card = card;
        this.screen = screen;
        this.startDay = startDay;
        this.status = status;
        this.price = price;
        this.detail = detail;
    }

    public Computer() {
    }
}
