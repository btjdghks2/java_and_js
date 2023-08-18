package com.example.SpringConnection.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class DetailProductDto {

    @Column
    private Long id;

    @Column
    private String productname;

    @Column
    private String productcontent;

    @Column
    private int price;

    public DetailProductDto(Long id, String productname, String productcontent, int price) {
        this.id = id;
        this.productname = productname;
        this.productcontent = productcontent;
        this.price = price;
    }
}
