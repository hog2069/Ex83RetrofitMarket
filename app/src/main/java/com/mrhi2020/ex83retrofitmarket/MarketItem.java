package com.mrhi2020.ex83retrofitmarket;

public class MarketItem {
    int no;
    String name;
    String title;
    String msg;
    String price;
    String file;
    int favor;
    String date;

    public MarketItem() {
    }

    public MarketItem(int no, String name, String title, String msg, String price, String file, int favor, String date) {
        this.no = no;
        this.name = name;
        this.title = title;
        this.msg = msg;
        this.price = price;
        this.file = file;
        this.favor = favor;
        this.date = date;
    }
}
