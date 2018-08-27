package OopsConceptPart1;

public class CallByRefAndCallByValue {
	
	int a;
	int b;
	
	public static void main(String[] args) {

		CallByRefAndCallByValue obj=new CallByRefAndCallByValue();
		
		int j=1;
		int l=2;
		
		//obj.j=1;
		//obj.l=2;
		
		obj.testsum(j,l);
		
		obj.a=50;
		obj.b=60;
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.swap(obj);
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	}
	
	public int testsum(int a, int b) {
		int c=a+b;
		//System.out.println(c);
		return c;
		
	}
	
	public void swap(CallByRefAndCallByValue k) {
		int temp;
		temp=k.a;
		//System.out.println(temp);
		k.a=k.b;
		k.b=temp;
		System.out.println(k.a);
		System.out.println(k.b);
		//System.out.println(k.j);
		//System.out.println(k.l);
		
	}
	

}
