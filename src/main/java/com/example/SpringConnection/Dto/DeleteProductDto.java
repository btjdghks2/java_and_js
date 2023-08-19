package com.example.SpringConnection.Dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class DeleteProductDto {

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

    public DeleteProductDto(Long id, String productname, String productcontent, int price, int count) {
        this.id = id;
        this.productname = productname;
        this.productcontent = productcontent;
        this.price = price;
        this.count = count;
    }

    public Long getId() {
        return id;
    }

    public String getProductname() {
        return productname;
    }

    public String getProductcontent() {
        return productcontent;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
