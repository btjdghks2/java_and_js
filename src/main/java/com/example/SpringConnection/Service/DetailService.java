package com.example.SpringConnection.Service;

import com.example.SpringConnection.Dto.DetailProductDto;
import com.example.SpringConnection.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@Transactional
@RequiredArgsConstructor
public class DetailService {

    private final ProductRepository productRepository;


    public void DetailProductService(Long id, String productname, String productcontent, int price) {

        productRepository.findById(id);
    }


}
