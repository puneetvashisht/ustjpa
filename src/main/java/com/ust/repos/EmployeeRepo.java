package com.ust.repos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ust.entity.Employee;

public class EmployeeRepo {
	
EntityManagerFactory emf = Persistence.createEntityManagerFactory("myjpa");
	
	public void insertEmployee(Object obj){
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
			em.persist(obj);
		
		transaction.commit();
		em.close();
	}

	public Employee findEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
			Employee employee = em.find(Employee.class,id);
		
		transaction.commit();
		em.close();
		return employee;
		
	}

}
