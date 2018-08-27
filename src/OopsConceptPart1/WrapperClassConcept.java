package OopsConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="100";
		System.out.println(s+20);
		
		int i=Integer.parseInt(s);
		System.out.println(i);
		
		String sk="13.34";
		double d =Double.parseDouble(sk);
		System.out.println(d);
		
		String sp="true";
		boolean p =Boolean.parseBoolean(sp);
		System.out.println(p);
		
		int k=100;
		String j=String.valueOf(k);
		System.out.println(j+20);
		
		String o="189";
		//int t=Integer.valueOf(o);
		int y=Integer.parseInt(o);
		System.out.println(y);
				
		

	}

}
