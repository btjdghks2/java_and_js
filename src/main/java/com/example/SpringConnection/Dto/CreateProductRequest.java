package com.example.SpringConnection.Dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CreateProductRequest {

    @Column
    private Long id;

    @Column
    private String productname;

    @Column
    private String productcontent;

    @Column
    private int price;

    @Column
    private int count;

    public CreateProductRequest(Long id, String productname, String productcontent, int price, int count) {
        this.id = id;
        this.productname = productname;
        this.productcontent = productcontent;
        this.price = price;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductcontent() {
        return productcontent;
    }

    public void setProductcontent(String productcontent) {
        this.productcontent = productcontent;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
