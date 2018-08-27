package JavaBasics;

public class IfElseCondition {

	public static void main(String[] args) {
		int a=1000;
		int b=5000;
		int c=250;
		
		if (a>b & a>c) {
			System.out.println("a is greater of all");
		}
		
		else if (b>c) {
			System.out.println("b is greater of all");
		}
		
		else{
			System.out.println("c is greater of all");
		}

	}

}
