package com.mirc.Ecomm.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirc.Ecomm.Service.OrderService;
import com.mirc.Ecomm.entity.OrderDetails;
import com.mirc.Ecomm.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService {
@Autowired
 OrderRepository orderRepository ;
	@Override
	public OrderDetails addOrder(OrderDetails orderDetails) {
	
		return orderRepository.save(orderDetails);
	}

	@Override
	public List<OrderDetails> getOrder() {
		
		return orderRepository.findAll();
	}

	
	@Override
	public Optional<OrderDetails> getOrderById(Long oid) {
		
		return orderRepository.findById(oid);
	}

	@Override
	public OrderDetails deleteOrder(Long oid) {
	orderRepository.deleteById(oid);
		return null;
	}

}
