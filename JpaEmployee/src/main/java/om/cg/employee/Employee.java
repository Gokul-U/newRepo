package om.cg.employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue
	private int employeeId;
	
	private String employeeFirstName, employeeLastName;
	private long employeeMobile;
	
	public Employee() {
		super();
	}

	public Employee(String employeeFirstName, String employeeLastName, long employeeMobile) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeMobile = employeeMobile;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFirstName() {
		return employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public long getEmployeeMobile() {
		return employeeMobile;
	}

	public void setEmployeeMobile(long customerMobile) {
		this.employeeMobile = customerMobile;
	}
	
	
	
}
