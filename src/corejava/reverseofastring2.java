package corejava;

public class reverseofastring2 
{
	public void display()
	{
		String str="jhansi";
		String str1="";
		System.out.println(str.length());
		int len=str.length();
		for (int i=len-1;i>=0;i--) 
		{
			str1=str1+str.charAt(i);
			
		}
		System.out.println("reverse of a string:"+str1);
		
	}
	
	public static void main(String[] args) 
	{
		reverseofastring2 aa=new reverseofastring2();
		aa.display();
		
	}

}
