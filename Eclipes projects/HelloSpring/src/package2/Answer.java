package package2;

public class Answer {
	private int id ;
	private String question;
	private String by;
	
	public Answer() {
		System.out.println("I am in here");
	}
	public Answer(int id ,String question,String by) {
		super();
		this.id=id;
		this.question=question;
		this.by=by;
		
	}
	public String toString() {
		return  id+" "+question+" "+"Question by"+by;
	}
}
