package com.example.SpringConnection.Dto;

import com.example.SpringConnection.domain.Member;
import com.example.SpringConnection.domain.Order;
import com.example.SpringConnection.domain.Product;
import jakarta.persistence.Column;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
public class OrderListViewDto {

    private Long id;
    private Member member;
    private Product product;

    public OrderListViewDto(Order o) {
        id = o.getId();
    }
}
