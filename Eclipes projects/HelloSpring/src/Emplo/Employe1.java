package Emplo;

public class Employe1 {
	private int id ;
	private String name;
	
	public Employe1() {
		System.out.println("Def cons");
	}
	public Employe1(int id) {
		this.id=id;
	}
	public Employe1(String name) {
		this.name=name;
	}
	public Employe1(String name,int id) {
		this.id=id;
		this.name=name;
	}
	void show() {
		System.out.println(id+" "+name);
	}
}
