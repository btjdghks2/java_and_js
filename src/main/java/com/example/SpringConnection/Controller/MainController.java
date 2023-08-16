package com.example.SpringConnection.Controller;


import com.example.SpringConnection.Dto.MainPageProductListDto;
import com.example.SpringConnection.Service.MainService;
import com.example.SpringConnection.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainService mainService;


    public ResponseEntity<List<MainPageProductListDto>> MainPageProductListControl(MainPageProductListDto mainPageProductListDto) {

        Product product = new Product();
        product = mainService.MainPageProductListService(mainPageProductListDto);
        return

    }
}
