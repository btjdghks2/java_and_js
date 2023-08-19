package com.example.SpringConnection.htmlform.HService;

import com.example.SpringConnection.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HtmlService {

    private final ProductRepository productRepository;


    public FindAllViewRequest FindAllHomeService(FindAllViewRequest request) {

        request =  productRepository.findAll();

        return FindAllViewRequest(request);
    }

    public
}
