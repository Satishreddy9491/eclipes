package staticKey;

public class StaticVariable {
	int id;
	String name;
	static String collegename="SVSR";
	
	 StaticVariable(int id,String name) {
		this.id=id;
		this.name=name;
	} 
	 void dispaly() {
		 System.out.println(id+" "+name+" "+collegename);
	 }
	 public static void main(String[] args) {
		StaticVariable result=new StaticVariable(1, "Satish");
		StaticVariable result1=new StaticVariable(2, "Reddy");
		result.dispaly();
		result1.dispaly();
	}
	
}
