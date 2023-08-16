package com.example.SpringConnection.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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


}
