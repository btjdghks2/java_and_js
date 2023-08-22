package com.example.SpringConnection.Dto;

import com.example.SpringConnection.domain.Product;
import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AdminCreateProductDto {
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

    @Builder
    public AdminCreateProductDto(Long id, String productname, String productcontent, int price, int count) {
        this.id = id;
        this.productname = productname;
        this.productcontent = productcontent;
        this.price = price;
        this.count = count;
    }

    public Product toEntity() {
        return Product.builder()
                .id(id)
                .productname(productname)
                .productcontent(productcontent)
                .price(price)
                .count(count)
                .build();
    }
}
