package com.example.SpringConnection.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String productname;

    @Column
    private String productcontent;

    @Column
    private int price;

    @Column
    private int count;


    @JoinColumn
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;

    @Builder
    public Product(Long id, String productname, String productcontent, int price, int count) {
        this.id = id;
        this.productname = productname;
        this.productcontent = productcontent;
        this.price = price;
        this.count = count;
    }

    public void AdminUpdateProductDto(String productname, String productcontent, int price, int count) {
        this.productname = productname;
        this.productcontent = productcontent;
        this.price = price;
        this.count = count;
    }
}
