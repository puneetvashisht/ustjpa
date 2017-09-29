package jpademo;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.ust.entity.Address;
import com.ust.entity.User;
import com.ust.repos.UserRepo;

public class TestUserInsert {
	
	//CRUD methods
//	1. Persist
//	2. Find
//	3. call setter method on the entity
//	4. Remove

//	@Test
	public void test() {
		UserRepo repo = new UserRepo();
		
		User user = new User("test5@gmail.com", 23);
		
		Address address1 = new Address("Canaught Palace", "Delhi");
		address1.setUser(user);
		Address address2 = new Address("Kamata", "Tokyo");
		address2.setUser(user);
		Set<Address> addresses = new HashSet<>();
		addresses.add(address1);
		addresses.add(address2);
		
		
		user.setAddresses(addresses);
		repo.insertUser(address1);
	}
	
	@Test
	public void testFindUser() {
		UserRepo repo = new UserRepo();
		
		User user = repo.findUser(1);
		System.out.println(user);
		System.out.println(user.getAddresses());
		
		assertEquals(user.getEmail(), "test4@gmail.com");
	}
	
//	@Test
	public void testFindUserAgeGrTh18() {
		UserRepo repo = new UserRepo();
		
		List<User> users = repo.findUserByAge(18);
		System.out.println(users);
		assertEquals(users.size(), 2);
	}

}
