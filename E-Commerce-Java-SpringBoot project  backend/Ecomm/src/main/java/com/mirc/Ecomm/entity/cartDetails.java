package com.mirc.Ecomm.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "CartDetails")
public class cartDetails {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cid;
    @OneToOne
    
	private UserDetails userDetails;
    @OneToMany
  
	private List<Product> productDetailsList;
    @JsonIgnore
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public List<Product> getProductDetailsList() {
		return productDetailsList;
	}
	public void setProductDetailsList(List<Product> productDetailsList) {
		this.productDetailsList = productDetailsList;
	}
	
	
	
	
}
