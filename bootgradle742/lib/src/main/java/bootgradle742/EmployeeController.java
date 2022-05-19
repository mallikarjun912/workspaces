package bootgradle742;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	List<Employee> emplist = new ArrayList<Employee>();
	public EmployeeController() {
		emplist.add(new Employee(201, "aaa", 6000)); 
		emplist.add(new Employee(261, "bbb", 7000)); 
		emplist.add(new Employee(301, "ccc", 7000)); 
	}
	@PostMapping
	public String addEmployee(@RequestBody Employee emp) {
		return emp.getCode()+emp.getEmpname()+emp.getSalary();
	}
	
	@GetMapping
	public List<Employee> getEmpls() {
		return emplist;
	}
	@GetMapping("/id/{code}")
	public Employee getEmpByCode(@PathVariable int code) {
		for(Employee emp : emplist) {
			if(emp.getCode()==code)
				return emp;
		}
		return null;
	}
}
