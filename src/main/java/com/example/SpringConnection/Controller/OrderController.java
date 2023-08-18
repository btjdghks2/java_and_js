package com.example.SpringConnection.Controller;

import com.example.SpringConnection.Dto.EditOrderDto;
import com.example.SpringConnection.Dto.OrderListViewDto;
import com.example.SpringConnection.Repository.OrderRepository;
import com.example.SpringConnection.Service.OrderService;
import com.example.SpringConnection.domain.Order;
import com.example.SpringConnection.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class OrderController {

    // 여기가 꽃인데..일단 주문 수정,삭제,조회

    private final OrderService orderService;
    private final OrderRepository orderRepository;

    @GetMapping("/api/order/")
    public List<OrderListViewDto> OrderListControl() {

        List<Order> orders = orderRepository.findAll();
        List<OrderListViewDto> result = orders.stream()
                .map(o -> new OrderListViewDto(o))
                .collect(Collectors.toList());

        return result;
    }

    @PatchMapping("/api/order/edit")
    public ResponseEntity<Order> EditOrderOrderControl(@RequestBody EditOrderDto editOrderDto) {
        Order order = orderService.EditOrderService(editOrderDto);
        return ResponseEntity.ok(order);

    }

    @DeleteMapping("/api/order/{id}/delete")
    public ResponseEntity<Order> DeleteOrderControl(@PathVariable Long id) {
        orderRepository.deleteById(id);
        return ResponseEntity.noContent().build();

    }

}
