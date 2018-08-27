package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar=new ArrayList();
		
		ar.add(1);
		ar.add(2);
		ar.add("Java");
		ar.remove(1);
		System.out.println(ar.size());
		//System.out.println(ar.get(2));
				
		//Print all the values of array list
		for(int i=0;i<ar.size();i++) {
			
			System.out.println(ar.get(i));
		}
		
		// To Store only int value
		
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(2);
		a1.add(5);
		
		ArrayList<String> b1=new ArrayList<String>();
		ArrayList<Double> c1=new ArrayList<Double>();
		
		}

}
