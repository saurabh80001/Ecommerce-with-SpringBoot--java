package com.mirc.Ecomm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mirc.Ecomm.entity.cartDetails;
import com.mirc.Ecomm.Service.cartService;

@RestController
@RequestMapping("/api/cart")
public class cartController {
   
	@Autowired 
	private cartService Cartservice ;
	
	
	@PostMapping("/addcart")
	public cartDetails addCart(@RequestBody cartDetails CartDetails) {
		
		return Cartservice.addCart(CartDetails);
	}
	@GetMapping("/all")
	public List<cartDetails> getCart(){
		
		return Cartservice.getCart();
	}
	@GetMapping("/{cartId}")
	public cartDetails getCartById(@PathVariable Long cartId) {
		
		return Cartservice.getCartById(cartId);
	}
	
	@DeleteMapping("delete/{cartId}")
	public cartDetails deleteCartById(@PathVariable Long cartId) {
		
		return Cartservice.deleteCartById(cartId);
	}
}
