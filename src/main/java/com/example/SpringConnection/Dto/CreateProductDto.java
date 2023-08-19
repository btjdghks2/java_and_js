package com.example.SpringConnection.Dto;

import com.example.SpringConnection.domain.Product;
import jakarta.persistence.Column;

import lombok.Data;

@Data
public class CreateProductDto {


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

    public CreateProductDto(Product product) {
        this.id = id;
        this.productname = productname;
        this.productcontent = productcontent;
        this.price = price;
        this.count = count;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setProductcontent(String productcontent) {
        this.productcontent = productcontent;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
