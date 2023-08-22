package com.example.SpringConnection.Dto;

import jakarta.persistence.Column;

public class AdminUpdateProductDtoPost {
    @Column
    private String productname;

    @Column
    private String productcontent;

    @Column
    private int price;

    @Column
    private int count;


    public void update(String productname, String productcontent, int price, int count) {

        this.productname = productname;
        this.productcontent = productcontent;
        this.price = price;
        this.count = count;
    }
}
