package JavaBasics;

import java.util.Hashtable;


public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Thread safe
		//Synchronised
		
		
		Hashtable h=new Hashtable();
		
		h.put("A","Jai");
		h.put("B", "Sowmi");
		
		h.put(1, 100);
		h.put(2,200);
		
		h.put(1, "Jai");
		//h.containsKey("A");
		System.out.println(h.entrySet());// gives key value pairs separately
		System.out.println(h.keySet());// gives key values
		System.out.println(h.containsKey("A"));
		
		System.out.println(h.get("B"));
		
		Hashtable <String,String> j=new Hashtable <String,String>();
		
		Hashtable <Integer,String> i=new Hashtable <Integer,String>();
		
	}

}
