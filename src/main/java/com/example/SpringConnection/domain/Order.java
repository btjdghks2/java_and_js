package com.example.SpringConnection.domain;

import jakarta.persistence.*;
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

    public Order(Long id) {
        this.id = id;
    }
}
