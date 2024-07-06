package com.mirc.Ecomm.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mirc.Ecomm.Service.OrderService;
import com.mirc.Ecomm.entity.OrderDetails;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@GetMapping("/all")
	public List<OrderDetails> getOrder() {
		
	return	orderService.getOrder();
	}
  @GetMapping("/all/{oid}")
  public Optional<OrderDetails> getOrderById(@PathVariable Long oid) {
	  
	  return orderService.getOrderById(oid);
  }
  
  @PostMapping("/add")
  public OrderDetails addOrder(@RequestBody OrderDetails orderDetails) {
	  
	  return orderService.addOrder(orderDetails);
  }
  @DeleteMapping("/delete/{oid}")
  public OrderDetails deleteOrder(@PathVariable Long oid) {
	  
	 return orderService.deleteOrder(oid);
	 
  }
}
