package com.example.SpringConnection.Controller;

import com.example.SpringConnection.Dto.CreateProductDto;
import com.example.SpringConnection.Dto.UpdateProductDto;
import com.example.SpringConnection.Repository.ProductRepository;
import com.example.SpringConnection.Service.AdminService;
import com.example.SpringConnection.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;
    private final ProductRepository productRepository;

    @PostMapping("/api/admin/new")
    public ResponseEntity<Product> CreateProductControl(@RequestBody CreateProductDto createProductDto) {
        Product product = adminService.CreateProductService(createProductDto);
        return ResponseEntity.ok(product);


    }



    @DeleteMapping("/api/admin/{id}/delete")
    public ResponseEntity<Product> DeleteProductControl(@PathVariable Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}
