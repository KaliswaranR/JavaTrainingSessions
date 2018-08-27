package OopsConceptPart1;

public class StaticAndNonStatic {
	
	String name="Jai";
	static int age=35;
	
	public static void main(String [] args) {
		
	sum();
	StaticAndNonStatic.sum();
		//StaticAndNonStatic obj=new StaticAndNonStatic();
		//obj.sendmain();
		//System.out.println(obj.name);
		
		}
	
	public void sendmain() {
		System.out.println("sendmain");
		System.out.println(age);
		System.out.println(name);
		
	}
	
	public static void sum() {
		System.out.println("sum method");
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
				
		
	}

}
