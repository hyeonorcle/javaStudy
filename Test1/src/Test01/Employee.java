package Test01;



class Employee {
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String jobId;
	private double salary;
	private String department;
	

	public Employee() {

	}

	
	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	


	
	@Override
	public String toString() {
	
		return String.format("%6s\t %-10s\t %-10s\t %-10s\t %-10s\t %8.0f %-10s ",
						employeeId, firstName, lastName, email, jobId,salary, department);
		
		
	}

}


