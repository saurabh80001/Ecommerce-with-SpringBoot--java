package com.mirc.Ecomm.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirc.Ecomm.Service.ProductService;
import com.mirc.Ecomm.entity.Product;
import com.mirc.Ecomm.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product productDetails) {
	
		 return productRepository.save(productDetails);
		 
	}

	@Override
	public List<Product> getProduct() {
		
		return productRepository.findAll();
	}

	
	@Override
	public Product getProductById(Long pid) {
		
		return productRepository.findById(pid).orElse(null);
	}
	

	@Override
	public Product deleteProduct(Long pid) {
		productRepository.deleteById(pid);
		return null;
	}

}
