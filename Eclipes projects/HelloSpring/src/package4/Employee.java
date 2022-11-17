package package4;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Address employeeAdders;
	
	
	public Employee() {
		System.out.println("ijdfhb");	
	}
	public Employee(int employeeId,String employeeName) {
		super();
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	public Employee(int employeeId,String employeeName,Address employeeAdders ) {
		super();
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAdders=employeeAdders;
	}
	void show() {
		System.out.println("Employee Id : "+employeeId+" "+"Employee Name : "+employeeName);
		
		System.out.println(employeeAdders);
	}
}
	