package OopsConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava a=new FunctionsInJava();
		a.test();
		String y=a.abc();
		//System.out.println(y);
		a.division(5,7);
		
	
	}
		public void test(){
			System.out.println("print test");
		}
		
		public String abc() {
			System.out.println("return vaulue");
			String a="1";
			String b="2";
			String c=a+b;
			System.out.println(c);
			return c;
		}
		
		public int division(int x, int y) {
			System.out.println("division method");
			int d=x/y;
			return d;
		}

	}


