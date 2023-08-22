package com.example.SpringConnection.Dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AdminUpdateProductDto {


    @Column
    private String productname;

    @Column
    private String productcontent;

    @Column
    private int price;

    @Column
    private int count;

    @Builder
    public AdminUpdateProductDto(String productname, String productcontent, int price, int count) {

        this.productname = productname;
        this.productcontent = productcontent;
        this.price = price;
        this.count = count;
    }
}
