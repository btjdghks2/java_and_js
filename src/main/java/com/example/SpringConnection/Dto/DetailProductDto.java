package com.example.SpringConnection.Dto;

import com.example.SpringConnection.domain.Product;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter

public class DetailProductDto {

    @Column
    private Long id;

    @Column
    private String productname;

    @Column
    private String productcontent;

    @Column
    private int price;

    public DetailProductDto(Product product) {
        this.id = id;
        this.productname = productname;
        this.productcontent = productcontent;
        this.price = price;
    }
}
