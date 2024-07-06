package com.mirc.Ecomm.Service;

import java.util.List;

//import com.mirc.Ecomm.entity.OrderDetails;
import com.mirc.Ecomm.entity.Product;

public interface ProductService {
	Product	addProduct(Product productDetails);
	List<Product>getProduct();
	Product getProductById(Long pid);
	Product deleteProduct(Long pid);
}
