package corejava;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedlist
{
	public void display()
	{
		LinkedList al=new LinkedList();
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
		linkedlist cc=new linkedlist();
		cc.display();
		
	}


}
