package corejava;

import java.util.ArrayList;

public class arraylist 
{
	public void display()
	{
		ArrayList al=new ArrayList();
		//ArrayList<String>al=new ArrayList<String>();
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
	public static void main(String[] args) 
	{
		arraylist cc=new arraylist();
		cc.display();
		
	}

}
