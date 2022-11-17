package test;

class Add{
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a*b+c;
	}
}

public class MethodOverLoading{
	public static void main(String args[]) {
		System.out.println(Add.add(1,2));
		System.out.println(Add.add(2,3,4));
		
	}
}
	

