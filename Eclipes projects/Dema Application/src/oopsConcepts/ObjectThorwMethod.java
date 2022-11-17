package oopsConcepts;

public class ObjectThorwMethod {
	int id;
	String name;
	void insertValues(int id,String name) {
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		ObjectThorwMethod student=new  ObjectThorwMethod();
		ObjectThorwMethod student1=new  ObjectThorwMethod();
		
		student.insertValues(1, "Satish");
		student1.insertValues(2, "reddy");
		student.display();
		student1.display();
	}
}
