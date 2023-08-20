package com.example.SpringConnection.htmlform.HController;

import com.example.SpringConnection.Dto.*;
import com.example.SpringConnection.Repository.ProductRepository;
import com.example.SpringConnection.Service.AdminService;
import com.example.SpringConnection.domain.Product;
import com.example.SpringConnection.htmlform.HService.HtmlService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class HtmlController {

    private final ProductRepository productRepository;
    private final AdminService adminService;

    //메인 페이지 리스트
    @GetMapping("/")
    public List<MainPageProductListDto> HomeControl(MainPageProductListDto mainPageProductListDto) {

        List<Product> products = productRepository.findAll();
        List<MainPageProductListDto> result = products.stream()
                .map(p -> new MainPageProductListDto(p))
                .collect(Collectors.toList());
        return result;
    }
    //어드민 페이지

    @PostMapping("/admin/new")
    public CreateProductDto AdminCreateControl(CreateProductDto createProductDto) {

        Product product = adminService.CreateProductService(createProductDto);
        return new CreateProductDto(product);
    }

    @PatchMapping("/admin/edit/{id}/")
    public UpdateProductDto AdminUpdateControl(@PathVariable Long id, UpdateProductDto updateProductDto) {
        Product product = adminService.EditProductService(id,updateProductDto);
        return new UpdateProductDto(product);
    }

    @DeleteMapping("/admin/delete")
    public DeleteProductDto AdminDeleteControl(DeleteProductDto deleteProductDto) {
        Product product = productRepository.deleteById(deleteProductDto);
        return new DeleteProductDto(product);

    }
    // 상품 디테일 페이지
    @GetMapping("/main/detail")
    public DetailProductDto DetailControl(DetailProductDto detailProductDto) {
        Product product = productRepository.findById(detailProductDto.getId()).orElseThrow();



        return new DetailProductDto(product);
    }


}
