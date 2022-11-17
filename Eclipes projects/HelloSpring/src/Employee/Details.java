package Employee;

public class Details {
	private int id;
	private String name;
	private Address adderss;
	
	public Details() {
		System.out.println("Satish");
	}
	
	public Details(int id,String name,Address adderss) {
		super();
		this.id=id;
		this.name=name;
		this.adderss=adderss;
	}
	void show() {
		System.out.println("Employee id="+id);
		System.out.println("employee name="+name);
		System.out.println(adderss.toString());
	}
}
