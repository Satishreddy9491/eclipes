package constructor;

//A Constructor which is specific number of parameters is called a parameterized constructor	

public class ParameterizedConstrctor {
	int id;
	String name;
	ParameterizedConstrctor(int id,String name) {
		this.id=id;
		this.name=name;
	}
	void dispaly() {
		System.out.println(id+  "    " +name);
	}
	public static void main(String[] args) {
		ParameterizedConstrctor res=new ParameterizedConstrctor(1,"satish");
		ParameterizedConstrctor res1=new ParameterizedConstrctor(2, "Reddy");
		res.dispaly();
		res1.dispaly();
	}
}
