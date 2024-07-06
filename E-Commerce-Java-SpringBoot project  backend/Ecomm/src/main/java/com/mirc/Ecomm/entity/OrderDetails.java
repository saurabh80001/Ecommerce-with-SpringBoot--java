package com.mirc.Ecomm.entity;

import java.time.LocalDateTime;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class OrderDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long oid;
	@OneToOne
	
    private UserDetails userDetails;
    private Double totalOrderPrice ;
    private LocalDateTime odate;
	public Long getOid() {
		return oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public UserDetails getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
	public Double getTotalOrderPrice() {
		return totalOrderPrice;
	}
	public void setTotalOrderPrice(Double totalOrderPrice) {
		this.totalOrderPrice = totalOrderPrice;
	}
	public LocalDateTime getOdate() {
		return odate;
	}
	public void setOdate(LocalDateTime odate) {
		this.odate = odate;
	}
    
    
    
}
