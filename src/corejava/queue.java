package corejava;


import java.util.LinkedList;
import java.util.PriorityQueue;

public class queue 
{
	public void display()
	{
		//LinkedList al=new LinkedList();
		PriorityQueue al=new PriorityQueue();
		
		al.add(30);
		al.offer(20);
		//al.offer("string");
		//al.offer("null");
		//al.add("null");
		al.offer(10);
		al.add(10);
		System.out.println(al);
	}
	public static void main(String[] args) 
	{
		queue aa=new queue();
		aa.display();
		
	}

}
