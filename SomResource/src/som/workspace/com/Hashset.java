package som.workspace.com;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String>al=new HashSet<String>();
		al.add("sachin");
		al.add("rahul");
		al.add("ramesh");
		al.add("sachin");
		
		Iterator<String> itr=al.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	      }  
		

	}

}
