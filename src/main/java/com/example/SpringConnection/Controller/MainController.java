package com.example.SpringConnection.Controller;


import com.example.SpringConnection.Dto.MainPageProductListDto;
import com.example.SpringConnection.Repository.ProductRepository;
import com.example.SpringConnection.Service.MainService;
import com.example.SpringConnection.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;
    private final ProductRepository productRepository;


    @GetMapping("/api/main")
    public List<MainPageProductListDto> MainPageProductListControl() {

        List<Product> products = productRepository.findAll();
        List<MainPageProductListDto> result = products.stream()
                .map(p -> new MainPageProductListDto(p))
                .collect(Collectors.toList());
        return result;


    }
}
