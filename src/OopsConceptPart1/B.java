package OopsConceptPart1;

public class B extends A {

	public B() {
		super();
	}

	public B(int a) {
		super(a);
	}

	public B(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(20, 30);
		
		System.out.println(obj.getClass());
		
	}
}
