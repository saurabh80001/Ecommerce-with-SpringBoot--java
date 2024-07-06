package com.mirc.Ecomm.Service;

import java.util.List;
import java.util.Optional;

import com.mirc.Ecomm.entity.OrderDetails;

public interface OrderService {

OrderDetails	addOrder(OrderDetails orderDetails);
List<OrderDetails>getOrder();
	Optional<OrderDetails> getOrderById(Long oid);
	OrderDetails deleteOrder(Long oid);
}
