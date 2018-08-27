package OopsConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(5);
		obj.sum("YYY");
		obj.sum(6,"UUU");
	}
	
	public void sum() {
		System.out.println("nothing to add");
	}
	
	public void sum(int i) {
		System.out.println(i);
	}
	
	public void sum(String i) {
		System.out.println(i);
	}
	
	public void sum(int y, String x) {
		System.out.println(y+x);
	}
	
	public static void main() {
		
	}
	
	public void main(int a) {
	}
}