package thisKey;

public class WithOutThis {
	int id;
	String name;
	float fee;
	
	 WithOutThis(int id,String name,float d) {
		 id=id;
		 name=name;
		 d=d;
	}
	 void display() {
		 System.out.println(id+ " "+name+" "+fee );
	 }
	 public static void main(String[] args) {
		WithOutThis res=new WithOutThis(1, "Satish", 943.0f);
		WithOutThis res1=new WithOutThis(2, "Reddy", 4353.0f);
		res.display();
		res1.display();
	}
	
	
}
