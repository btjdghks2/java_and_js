package com.example.SpringConnection.htmlform.HService;

import com.example.SpringConnection.Dto.AdminCreateProductDto;
import com.example.SpringConnection.Dto.AdminUpdateProductDto;
import com.example.SpringConnection.Dto.CreateOrderDto;
import com.example.SpringConnection.Repository.OrderRepository;
import com.example.SpringConnection.Repository.ProductRepository;
import com.example.SpringConnection.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HtmlService {

    private final ProductRepository productRepository;
    private final OrderRepository orderRepository;


    public Long CreateProductService(AdminCreateProductDto adminCreateProductDto) {
        return productRepository.save(adminCreateProductDto.toEntity()).getId();
    }

    public Long EditProductService(Long id, AdminUpdateProductDto adminUpdateProductDto) {

        Product posts = productRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 상품이 존재하지 않습니다 id=" + id));
        posts.AdminUpdateProductDto(adminUpdateProductDto.getProductname(),
                                        adminUpdateProductDto.getProductcontent(),
                                        adminUpdateProductDto.getPrice(),
                                        adminUpdateProductDto.getCount());
        return id;
    }

    public Long CreateOrderup(CreateOrderDto createOrderDto) {
        return  orderRepository.save(createOrderDto.toEntity()).getId();
    }
}
