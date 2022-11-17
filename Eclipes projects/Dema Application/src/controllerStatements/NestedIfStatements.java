package controllerStatements;

public class NestedIfStatements {
	public static void main(String[] args) {
		int age=18;
		int weight=74;
		
		if(age>=18) {
			if(weight>=50) {
				System.out.println("Your eligible to Donate the blood");
			}
			else {
				System.out.println("Weight is must be grater then 50");
			}
		}
		else {
			System.out.println("Bellow 18 years not eligible to donate the blood");
		}
	}
}
