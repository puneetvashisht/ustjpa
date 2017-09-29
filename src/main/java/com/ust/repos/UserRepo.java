package com.ust.repos;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ust.entity.Address;
import com.ust.entity.User;

public class UserRepo {
	
//	1.Create Entity Manager Factory
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myjpa");
	
	public void insertUser(Object obj){
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
			em.persist(obj);
		
		transaction.commit();
		em.close();
	}
	
	
	
	public User findUser(int id){
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
			User user = em.find(User.class,id);
//			user.setEmail("test4@gmail.com");
//			Address address = new Address("Kuta", "Bali");
//			address.setUser(user);
//			Set<Address> addresses = user.getAddresses();
//			System.out.println(addresses);
//			addresses.add(address);
//			user.setAddresses(addresses);
		
		transaction.commit();
		em.close();
		return user;
	}

	public List<User> findUserByAge(int age) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Query query = em.createNamedQuery("salaryGrThanAge");
		
//			Query query = em.createQuery("from User u where u.age > :age");
			query.setParameter("age", age);
			List<User> users = query.getResultList();
		
		transaction.commit();
		em.close();
		return users;
	}

}
