package ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Collections {

	public static void main(String[] args) {
		
		
		System.out.println("****************Linked List**********************");
		LinkedList<String> a=new LinkedList<String>();  
		a.add("Vishisht");  
		a.add("Padiyar");  
		a.add("Is my name");  
		a.add("From Linked List");  
		Iterator<String> itr=a.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); 
		
		
		}
		System.out.println("\n****************Array List**********************");
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Vishisht");  
		list.add("Padiyar");  
		list.add("Is my name");  
		list.add("From Array List");  
		Iterator<String> i= list.iterator();  
		while(i.hasNext()){  
		System.out.println(i.next());
		 
		}
		
		
		System.out.println("\n****************Vector**********************");
		Vector<String> b =new Vector<String>();
		
		b.add("Vishisht");  
		b.add("Padiyar");  
		b.add("Is my name");  
		b.add("From Vector");  
		Iterator<String> j= b.iterator();  
		while(j.hasNext()){  
		System.out.println(j.next());
		 
		}
		
	}

}
