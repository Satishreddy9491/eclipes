package thisKey;

public class WithThis {
	int id;
	String name;
	float fee;

	WithThis(int id, String name, float fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(id + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		WithThis res=new WithThis(1, "Satish", 2342.0909f);
		WithThis res1=new WithThis(2, "Reddy", 8768.09f);

		res.display();
		res1.display();
	}

}
