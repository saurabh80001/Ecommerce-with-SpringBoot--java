package com.mirc.Ecomm.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mirc.Ecomm.Service.UserService;
import com.mirc.Ecomm.entity.UserDetails;
import com.mirc.Ecomm.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
@Autowired
 UserRepository userRepository;
	@Override
	public UserDetails addUser(UserDetails userDetails) {
		
		return userRepository.save(userDetails);
	}

	@Override
	public List<UserDetails> getUser() {
		
		return userRepository.findAll();
	}

	
	@Override
	public UserDetails getUserById(Long uid) {
		
		return userRepository.findById(uid).orElse(null);
	}

	@Override
	public UserDetails deleteUser(Long uid) {
		userRepository.deleteById(uid);
		return null;
	}

}
