package jpademo;

import org.junit.Test;

import com.ust.entity.ContractEmployee;
import com.ust.entity.Employee;
import com.ust.entity.RegularEmployee;
import com.ust.repos.EmployeeRepo;

public class TestInheritance {

//	@Test
	public void testInsertEmployee() {
		EmployeeRepo repo = new EmployeeRepo();
		Employee employee = new Employee("Ravi");
		
		repo.insertEmployee(employee);		
	}
	
//	@Test
	public void testInsertRegularEmployee() {
		EmployeeRepo repo = new EmployeeRepo();
		Employee employee = new RegularEmployee("Amit", 32423);
		
		repo.insertEmployee(employee);		
	}
//	@Test
	public void testInsertContractEmployee() {
		EmployeeRepo repo = new EmployeeRepo();
		Employee employee = new ContractEmployee("Priya", 32424);
		
		repo.insertEmployee(employee);		
	}
	@Test
	public void findEmployee() {
		EmployeeRepo repo = new EmployeeRepo();
		
		Employee emp = repo.findEmployee(1);
		System.out.println(emp);
	}
	
	

}
