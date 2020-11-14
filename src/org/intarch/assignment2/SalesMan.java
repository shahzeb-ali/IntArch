package org.intarch.assignment2;

public class SalesMan {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	private String name;
	private int employeeId;
	private String department;
	@Override
	public String toString() {
		return "SalesMan [name=" + name + ", employeeId=" + employeeId + ", department=" + department + "]";
	}

}
