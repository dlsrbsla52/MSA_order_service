package higmsa.orderservice.service;

import higmsa.orderservice.dto.OrderDto;
import higmsa.orderservice.jpa.OrderEntity;

public interface OrderService {

    OrderDto createOrder(OrderDto orderDto);

    OrderDto getOrderById(String orderId);

    Iterable<OrderEntity> getOrderByUserId(String userId);
}
