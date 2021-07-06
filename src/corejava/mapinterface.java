package corejava;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class mapinterface 
{
	public void display()
	{
		HashMap al=new HashMap();
		al.put(101, "jhansi");
		al.put(null, null);
		al.put(101, "teja");
		al.put(103, "jhansi");
		al.put(104, null);
		System.out.println(al);
		}
	public void display1()
	{
		LinkedHashMap al=new LinkedHashMap();
		al.put(101, "jhansi");
		al.put(null, null);
		al.put(101, "teja");
		al.put(103, "jhansi");
		al.put(104, null);
		al.put(101, "teja");
		System.out.println(al);
		
		
	}
	public void display3()
	{ TreeMap al=new TreeMap();
		al.put(101, "jhansi");
		//al.put(null, null);
		al.put(101, "teja");
		al.put(103, "jhansi");
		al.put(104, null);
		al.put(101, "teja");
		System.out.println(al);
	// null keys are not allowed	
	}
	public void display4()
	{
		Hashtable al=new Hashtable();
		al.put(101, "jhansi");
		//al.put(null, null);
		//al.put(101, "teja");
		al.put(103, "jhansi");
		//al.put(104, null);
		//al.put(101, "teja");
		al.put(104, "teja");
		System.out.println(al);
		//it doesnt allow null values and null keys
		
	}
	public static void main(String[] args) 
	{
		mapinterface aa=new mapinterface();
		aa.display();
		aa.display1();
		aa.display3();
		aa.display4();
		
	}

}
