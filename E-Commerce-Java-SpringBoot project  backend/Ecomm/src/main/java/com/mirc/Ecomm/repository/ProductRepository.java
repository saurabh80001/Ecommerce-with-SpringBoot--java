package com.mirc.Ecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirc.Ecomm.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
