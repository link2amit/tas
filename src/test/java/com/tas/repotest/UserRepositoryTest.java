package com.tas.repotest;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.tas.bean.User;
import com.tas.repository.UserRepository;

@SpringBootTest
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;

	@Test
	public void saveUser() {
		User user = new User();
		user.setEmail("aks@aks.com");
		user.setFirstName("Amit");
		user.setLastName("Srivastava");
		user.setRole("admin");
		userRepository.save(user);
		List<User> users = userRepository.findAll();
		Assert.notEmpty(users, "Could not save to the app user table");
	}
}
