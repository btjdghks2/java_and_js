package com.example.SpringConnection.Service;

import com.example.SpringConnection.Dto.CreateProductDto;
import com.example.SpringConnection.Dto.DeletePrdocutDto;
import com.example.SpringConnection.Dto.UpdateProductDto;
import com.example.SpringConnection.Repository.ProductRepository;
import com.example.SpringConnection.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.PrimitiveIterator;

@Service
@RequiredArgsConstructor
@Transactional
public class AdminService {

    private final ProductRepository productRepository;


    public Product CreateProductService(CreateProductDto createProductDto) {

        Product product = new Product();
        product.setId(createProductDto.getId());
        product.setProductname(createProductDto.getProductname());
        product.setProductcontent(createProductDto.getProductcontent());
        product.setPrice(createProductDto.getPrice());
        product.setCount(createProductDto.getCount());
        productRepository.save(product);
        return product;

    }

    public Product EditProductService(UpdateProductDto updateProductDto) {

        Product product = new Product();
        product.setId(updateProductDto.getId());
        product.setProductname(updateProductDto.getProductname());
        product.setProductcontent(updateProductDto.getProductcontent());
        product.setPrice(updateProductDto.getPrice());
        product.setCount(updateProductDto.getCount());
        productRepository.save(product);
        return product;
    }

}
