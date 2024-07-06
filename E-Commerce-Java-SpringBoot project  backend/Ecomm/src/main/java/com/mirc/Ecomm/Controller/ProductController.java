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
import com.mirc.Ecomm.entity.Product;
import com.mirc.Ecomm.Service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
@Autowired
ProductService productService ;
@GetMapping("/all")
public List<Product> getProduct()
{

return productService.getProduct();
}

@GetMapping("/{pid}")
public Product getProductById(@PathVariable Long pid) {
	
	return productService.getProductById(pid);
	}

@PostMapping("/add/")
public Product addProduct(@RequestBody Product productDetails) {
	
	return productService.addProduct(productDetails);
	}
@DeleteMapping("/delete/{pid}")
public Product deleteProduct(@PathVariable Long pid) {
	
	return productService.deleteProduct(pid);
	
}

}