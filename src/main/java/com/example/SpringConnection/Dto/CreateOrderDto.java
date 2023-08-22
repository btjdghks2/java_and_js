package com.example.SpringConnection.Dto;

import com.example.SpringConnection.domain.Member;
import com.example.SpringConnection.domain.Order;
import com.example.SpringConnection.domain.Product;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class CreateOrderDto {

    private Long id;

    private Member member;

    private List<Product> product = new ArrayList<>();

    public CreateOrderDto(Long id, Member member, List<Product> product) {
        this.id = id;
        this.member = member;
        this.product = product;
    }

    public Order toEntity() {
        return Order.builder()
                .id(id)
                .member(member)
                .product(product)
                .build();
    }
}
