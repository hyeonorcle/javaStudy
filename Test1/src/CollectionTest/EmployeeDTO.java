package CollectionTest;

import java.util.Formatter;

public class EmployeeDTO {
	
	private String employeeId;	//�ڹٿ����� ����Ŭ���� ǥ���� '_' �� �ι�° ������ �ܾ��� �빮�ڷ� ǥ�� ����Ŭ: employee_id 
	private String firstName;
	private String lastName;
	private String email;
	private String jobId;
	private String hireDate;
	
	

	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
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
	@Override
	public String toString() {
		Formatter fm = new Formatter();
		String result = fm.format("%6s\t %-10s\t %-10s\t %-10s\t %-10s\t %-10s",
						employeeId, firstName, lastName, email, jobId, hireDate).toString();
		return result;
				
//				 "EmployeeDTO [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
//					+ ", email=" + email + ", jobId=" + jobId + ", hireDate=" + hireDate + "]";
	}

	
}
