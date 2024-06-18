package com.javaBasedSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestContainer {
	public static void main(String[] args) {
  
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
        Employee employee = (Employee) context.getBean(Employee.class);
        System.out.println(employee.toString());
        
        Department department=(Department) context.getBean(Department.class);
        System.out.println(department.toString());
    }

}
