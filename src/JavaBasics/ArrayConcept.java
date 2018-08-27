package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		
		System.out.println(i[3]);
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++) {
			System.out.println(j);
			System.out.println(i[j]);	
			}
		
		double d[]=new double[5];
		d[0]=78;
		
		char c[]=new char[7];
		
		c[0]='f';
		c[1]='1';
		 System.out.println(c[1]);
		
		Object ob[]=new Object[3];
		ob[0]='H';
		ob[1]="YJIUJ";
		ob[2]=3;
		
		
	}

}
