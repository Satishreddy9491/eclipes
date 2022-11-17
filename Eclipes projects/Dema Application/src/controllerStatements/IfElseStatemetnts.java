package controllerStatements;

/*class IfElseStatemetnts {
	public static void main(String[] args) {
		int x=15;
		if(x%2==0) {
			System.out.println("even number ");
		}
		else {
			System.out.println("odd number");
		}
	}
}*/

public class IfElseStatemetnts{
	public static void main(String[] args) {
		int marks=78;
		
		if(marks<50) {
			System.out.println("your fail the Subject");
		}
		else if(marks<=50&&marks<65) {
			System.out.println("D grade");
		}
		else if(marks<=65&&marks<87) {
			System.out.println("C grade");
		}
		else if(marks<=87&&marks<90) {
			System.out.println("B grade");
		}
		else if(marks<=90&&marks<=95) {
			System.out.println("A grade");
		}
		else if(marks<=96&&marks<100) {
			System.out.println("A++ grade");
		}
		else {
			System.out.println("Invalid");
		}
	}
}
