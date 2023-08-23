package com.example.SpringConnection.htmlform.HController;

import com.example.SpringConnection.Dto.*;
import com.example.SpringConnection.Repository.OrderRepository;
import com.example.SpringConnection.Repository.ProductRepository;

import com.example.SpringConnection.domain.Order;
import com.example.SpringConnection.domain.Product;
import com.example.SpringConnection.htmlform.HService.HtmlService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class HtmlRestController {

    private final ProductRepository productRepository;
    private final HtmlService htmlService;
    private final OrderRepository orderRepository;

    //메인 페이지 리스트
    @GetMapping("/")
    public List<MainPageProductListDto> HomeControl(@RequestBody MainPageProductListDto mainPageProductListDto) {

        List<Product> products = productRepository.findAll();
        List<MainPageProductListDto> result = products.stream()
                .map(p -> new MainPageProductListDto(p))
                .collect(Collectors.toList());
        return result;
    }
    //어드민 페이지

    @PostMapping("/admin/new")
    public Long AdminCreateControl(@RequestBody AdminCreateProductDto adminCreateProductDto) {

        return htmlService.CreateProductService(adminCreateProductDto);
    }

    @PutMapping("/admin/edit/{id}/")
    public Long AdminUpdateControl(@PathVariable Long id, @RequestBody AdminUpdateProductDto adminUpdateProductDto) {
        return htmlService.EditProductService(id,adminUpdateProductDto);
    }

    @DeleteMapping("/admin/delete")
    public DeleteProductDto AdminDeleteControl(@RequestBody DeleteProductDto deleteProductDto) {
        Product product = productRepository.deleteById(deleteProductDto);
        return new DeleteProductDto(product);

    }
    // 상품 디테일 페이지
    @GetMapping("/main/detail/{id}")
    public DetailProductDto DetailControl(@PathVariable Long id,@RequestBody DetailProductDto detailProductDto) {
        Product product = productRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 상품입니다"+ id));

        return new DetailProductDto(product);
    }

    // order page

    //디테일 페이지에서 상품추가
    @PostMapping("/main/detail/new")
    public Long Orderup(@RequestBody CreateOrderDto createOrderDto) {
        return htmlService.CreateOrderup(createOrderDto);
    }

    @GetMapping("/main/order")
    public List<OrderListViewDto> OrderListView(@RequestBody OrderListViewDto OrderListViewDto) {
        List<Order> orders = orderRepository.findAll();
        List<OrderListViewDto> result = orders.stream()
                .map(o -> new OrderListViewDto(o))
                .collect(Collectors.toList());
        return result;
    }

    @DeleteMapping("/main/order/delete/{id}")
    public DeleteOrderProductDto DeleteOrderProduct(@PathVariable Long id,@RequestBody DeleteOrderProductDto deleteOrderProductDto) {
        Order order = orderRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("존재하지 않는 상품입니다" + id));
        return new DeleteOrderProductDto(order);
    }

}
