package com.mirc.Ecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirc.Ecomm.entity.OrderDetails;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails,Long>{

}
