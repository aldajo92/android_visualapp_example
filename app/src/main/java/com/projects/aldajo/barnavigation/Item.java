package com.projects.aldajo.barnavigation;

public class Item {
    String date;
    String address;
    public String title;

    public Item(String title) {
        this.title = title;
    }

    public Item(String date, String address) {
        this.date = date;
        this.address = address;
    }
}
