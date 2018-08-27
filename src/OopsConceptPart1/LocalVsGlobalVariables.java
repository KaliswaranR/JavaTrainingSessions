package OopsConceptPart1;

public class LocalVsGlobalVariables {
	
	String name="Jai";
	int age=35;

	public static void main(String[] args) {
	
		int i=10;
		System.out.println(i);
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		//System.out.println(obj.name);
		obj.sum();
		
	}
	
	public void sum() {
		int i=15;
		int j=25;
		
		int add=i+j;
		System.out.println(add);
		System.out.println(name);
	}

}
