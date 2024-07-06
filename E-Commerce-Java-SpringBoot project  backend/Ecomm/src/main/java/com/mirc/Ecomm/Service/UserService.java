package com.mirc.Ecomm.Service;

import java.util.List;

//import com.mirc.Ecomm.entity.OrderDetails;
import com.mirc.Ecomm.entity.UserDetails;

public interface UserService {
	UserDetails	addUser(UserDetails userDetails);
	List<UserDetails>getUser();
	UserDetails getUserById(Long uid);
	UserDetails deleteUser(Long uid);
}
