package autoWaring;

public class ReferenceOfByName {
	ByName byname;
	ReferenceOfByName(){
		System.out.println("Reference is Created");
	}
	public ByName getByName() {
		return byname;
	}
	public void setByName(ByName byname) {
		this.byname=byname;
	}
	void print() {
		System.out.println("Hello reference of ByName");
	}
	void disply() {
		print();
		byname.print();
	}
}

//public class ReferenceOfByName {  
//B b;  
//A(){System.out.println("a is created");}  
//public B getB() {  
//    return b;  
//}  
//public void setB(B b) {  
//    this.b = b;  
//}  
//void print(){System.out.println("hello a");}  
//void display(){  
//    print();  
//    b.print();  
//}  
//}  
