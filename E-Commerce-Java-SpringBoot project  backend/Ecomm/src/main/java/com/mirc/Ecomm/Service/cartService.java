package com.mirc.Ecomm.Service;

import java.util.List;



//import com.mirc.Ecomm.entity.OrderDetails;
import com.mirc.Ecomm.entity.cartDetails;

public interface cartService {

	cartDetails	addCart(cartDetails CartDetails);
	List<cartDetails>getCart();
	cartDetails getCartById(Long cartId);
	cartDetails deleteCartById(Long cartId);
}
