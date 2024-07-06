package com.mirc.Ecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirc.Ecomm.entity.cartDetails;
@Repository
public interface CartRepository extends JpaRepository<cartDetails,Long>{

}
