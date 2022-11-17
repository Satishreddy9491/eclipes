package package1;

import java.util.List;
import java.util.Set;
import java.util.Iterator;  


public class Question {
	private int id;
	private String name;
	private List<String> answers;
	private Set<String> answers1;
	
	public Question() {
		System.out.println("Not Showing any values");
	}
	public Question(int id,String name , List<String> answers) {
		super();
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	
	public Question(Set<String>answers1) {
		this.answers1=answers1;
	}
	
	public void displayInfo() {
		System.out.println("QuestionId : " +id+" "+"QuestionName : "+name);
		System.out.println("Answers are");
		Iterator<String> itrator=answers.iterator();  
		while(itrator.hasNext()) {
			System.out.println(itrator.next());
		}
	}
}


 
 
