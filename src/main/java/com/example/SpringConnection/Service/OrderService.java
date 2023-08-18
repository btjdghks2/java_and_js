package com.example.SpringConnection.Service;

import com.example.SpringConnection.Dto.EditOrderDto;
import com.example.SpringConnection.Repository.OrderRepository;
import com.example.SpringConnection.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;

    public Order EditOrderService(EditOrderDto editOrderDto) {

        Order order = new Order();
        order.setId(editOrderDto.getId());
        order.setMember(editOrderDto.getMember());
        order.setProduct(editOrderDto.getProduct());
        orderRepository.save(order);
        return order;
    }
}
