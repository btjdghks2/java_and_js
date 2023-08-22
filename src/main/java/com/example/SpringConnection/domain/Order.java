package com.example.SpringConnection.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "orders")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    @JoinColumn(name = "member_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;


    @OneToMany(mappedBy = "order")
    private List<Product> product = new ArrayList<>();

    @Builder
    public Order(Long id, Member member, List<Product> product) {
        this.id = id;
        this.member = member;
        this.product = product;
    }


}
