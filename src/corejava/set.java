package corejava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set 
{
	 public void display()
	 {
		 HashSet al=new HashSet();
		 al.add(10);
			al.add(30);
			al.add(20);
			al.add(20);
			al.add(20);
			al.add(null);
			al.add(null);
			al.add("jhansi");
			
			System.out.println(al);
			
		 
	 }
	 public void linkedhashset()
	 {
		 LinkedHashSet al=new LinkedHashSet();
		 al.add(10);
			al.add(30);
			al.add(20);
			al.add(20);
			al.add(20);
			al.add(null);
			al.add(null);
			al.add("jhansi");
			System.out.println(al);
		 
	 }
	 public void treeset()
	 {
		 TreeSet al=new TreeSet();
		 al.add(10);
			al.add(30);
			al.add(20);
			al.add(20);
			al.add(20);
		//	al.add(null);
			//al.add(null);
			//al.add("jhansi");
			System.out.println(al);
	//if we pass null values it will show nullpointer exception
	//it wont allow null values
	//if we pass differet objects we will get classcastexception
			
		 
	 }
	 public static void main(String[] args)
	 {
		 set aa=new set();
		 aa.display();
		 aa.linkedhashset();
		 aa.treeset();
		
	}

}
