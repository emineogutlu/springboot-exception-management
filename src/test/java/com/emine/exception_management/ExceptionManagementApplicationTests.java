package com.emine.exception_management;

import com.emine.dto.DtoEmployee;
import com.emine.service.IEmployeeService;
import com.emine.starter.ExceptionManagementStarter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes={ExceptionManagementStarter.class})
class ExceptionManagementApplicationTests {

	@Autowired
	private IEmployeeService employeeService;

	@BeforeEach
	public void beforeEach(){
		System.out.println("Before each çalıştı...");
	}


	@Test
	public void testFindEmployeeById(){
      DtoEmployee employee= employeeService.findEmployeeById(4L);
	  if(employee!=null){
		  System.out.println("Name: "+employee.getName());
		  assertNotNull(5);
	  }

	}

	@AfterEach
	public void afterEach(){
		System.out.println("AfterEach çalıştı..");
	}

}
