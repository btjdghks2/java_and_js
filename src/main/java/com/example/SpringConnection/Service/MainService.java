package com.example.SpringConnection.Service;

import com.example.SpringConnection.Dto.MainPageProductListDto;
import com.example.SpringConnection.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MainService {

    private final ProductRepository productRepository;



}
