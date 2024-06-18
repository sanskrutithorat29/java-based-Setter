package com.javaBasedSetter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
public class ConfigClass {
	 @Bean
	    public Employee employee() {
	        Employee employee = new Employee();
	        employee.setEmp_id(1);
	        employee.setEmp_name("Divyansh Thorat");
	        employee.setEmp_address("Pune");
	        employee.setDepartment(department());
	        return employee;
	    }
	@Bean
    public Department department() {
        Department department = new Department();
        department.setDept_id(101);
        department.setDept_name("KV School");
        return department;
    }

   

}
