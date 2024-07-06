package com.mirc.Ecomm.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirc.Ecomm.Service.cartService;
import com.mirc.Ecomm.entity.cartDetails;
import com.mirc.Ecomm.repository.CartRepository;
@Service
public class CartServiceImpl implements cartService {
	
	@Autowired
	private CartRepository cartRepository ;

	@Override
	public cartDetails addCart(cartDetails CartDetails) {
		
		return cartRepository.save(CartDetails);
	}

	@Override
	public List<cartDetails> getCart() {
		
		return cartRepository.findAll();
	}

	@Override
	public cartDetails getCartById(Long cartId) {
		
		return cartRepository.findById(cartId).orElse(null);
	}

	@Override
	public cartDetails deleteCartById(Long cartId) {
		
		 cartRepository.deleteById(cartId);
		 return null ;
	}

}
