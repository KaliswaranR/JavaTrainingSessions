package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String [][]a=new String[3][5];
		a[0][0]="D1";
		a[0][4]="B1";
		a[0][3]="B1";
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		
		for(int r=0;r<a.length; r++) {
			for(int y=0;y<a[0].length; y++) {
				
				System.out.println(a[r][y]);	
			}
		}

	}

}
