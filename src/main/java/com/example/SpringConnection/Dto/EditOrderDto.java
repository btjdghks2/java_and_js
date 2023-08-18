package com.example.SpringConnection.Dto;

import com.example.SpringConnection.domain.Member;
import com.example.SpringConnection.domain.Product;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@NoArgsConstructor
@Getter
@Setter
public class EditOrderDto {

    private Long id;

    private Member member;

    private List<Product> product;
    public Long getId() {
        id = getId();
        return id;
    }

    public Member getMember() {
        member = getMember();
        return member;
    }

    public List<Product> getProduct() {
        product = getProduct();
        return product;
    }
}
