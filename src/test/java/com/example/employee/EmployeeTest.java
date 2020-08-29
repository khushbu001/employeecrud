//package com.example.employee;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
////import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.times;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.employee.entity.Employee;
//import com.example.employee.entity.EmployeeDTO;
//import com.example.employee.repo.EmployeeRepo;
//import com.example.employee.service.EmployeeServiceImpl;
//
///**
// * 
// * @author khushii
// *
// */
////@Configurable(preConstruction=true)
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class EmployeeTest {
//
//	@Mock
//	private EmployeeRepo employeeRepo;
//
////	@Mock
////	@Autowired
////	private EmployeeMapper employeeMapper;
////	
////	private final EmployeeMapper employeeMapper1	= Mappers.getMapper(EmployeeMapper.class);
//
//	@InjectMocks
//	private EmployeeServiceImpl employeeServiceImpl;
//
//	@Before
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	public void testCreateEmployee() {
//
//		Employee emp = new Employee(1L, "khus", 9098909879L, "patna", true);
//
//		EmployeeDTO empDto = new EmployeeDTO(1L, "khus", 9098909879L, "patna", true);
//		
//		empDto.setEmpId(1L);
//		empDto.setEmpName("khus");
//		empDto.setEmpAddress("patna");
//		empDto.setEmpContact(9098909879L);
//		empDto.setEmpMaritalStatus(true);
//
//		when(employeeRepo.save(emp)).thenReturn(emp);
//
//		EmployeeDTO result = employeeServiceImpl.createEmployee(empDto);
//		System.out.println("value of  result" + result);
//		assertThat(result.getEmpId()).isEqualTo(1L);
//
//		assertEquals("khus", result.getEmpName());
//		assertThat(result.getEmpContact()).isEqualTo(9098909879L);
//		assertEquals("patna", result.getEmpAddress());
//		assertEquals(true, result.getEmpMaritalStatus());
//
//		verify(employeeRepo, times(1)).save(emp);
//
//	}
//	@Test
//	public void testUpdateEmployee() {
//		
//	}
//}