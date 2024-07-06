package com.mirc.Ecomm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mirc.Ecomm.entity.UserDetails;
@Repository
public interface UserRepository extends JpaRepository<UserDetails,Long> {

	
	
}
