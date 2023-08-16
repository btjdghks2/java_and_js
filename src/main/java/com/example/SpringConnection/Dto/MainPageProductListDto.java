package com.example.SpringConnection.Dto;

import com.example.SpringConnection.domain.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class MainPageProductListDto {

    // 일단 엔티티의 전체 내역이 아니라 이름,가격 만 가져와야 함

    private Long id;
    private String productName;
    private int price;

    public MainPageProductListDto(Product product) {
        id = product.getId();
        productName = product.getProductname();
        price = product.getPrice();

    }
}
