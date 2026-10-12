package com.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
	 public static void main(String[] args) {

		 AnnotationConfigApplicationContext context =
			        new AnnotationConfigApplicationContext(AppCongfig.class);

	        EmployeeService service =
	                context.getBean(EmployeeService.class);

	        service.addEmployee();
	        service.displayEmployee();
	        service.calculateSalary();

	        context.close();
	    }

}
