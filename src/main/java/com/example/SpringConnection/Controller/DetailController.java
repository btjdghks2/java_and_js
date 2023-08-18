package com.example.SpringConnection.Controller;

import com.example.SpringConnection.Dto.DetailProdcutResponse;
import com.example.SpringConnection.Dto.DetailProductDto;
import com.example.SpringConnection.Repository.ProductRepository;
import com.example.SpringConnection.Service.DetailService;
import com.example.SpringConnection.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DetailController {

    //여기에는 뭐가 들어가야 하냐면..
    //일단 조회 기능
    // product 조회 기능임 findbyid
    // 그 외엔..주문목록 추가,product count -1 기능

    private final DetailService detailService;
    private final ProductRepository productRepository;

    @GetMapping("/api/main/{id}")
    public ResponseEntity<Product> DetailPageControl(@PathVariable ("id") Long id) {
        Product product = productRepository.findById(id).orElseThrow();

        return ResponseEntity.ok(product);
    }

}
