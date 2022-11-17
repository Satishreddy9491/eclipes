package inheritance;


class Employee{
	float salary=9098;
}

public class Programmer extends Employee {
	int bounce=1232;
	public static void main(String[] args) {
		Programmer res=new Programmer();
		System.out.println("Programmer Salary :"+res.bounce);
		System.out.println("Employee salary :"+res.salary);
	}

}
