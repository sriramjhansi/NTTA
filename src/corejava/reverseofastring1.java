package corejava;

public class reverseofastring1 
{
	public void display()
	{
		
	 String str1="aarav";
	 String str2="";
	 int len=str1.length();
	 System.out.println(len);
	 for (int i=len-1;i>=0;i--) 
	 {
		 str2=str2+str1.charAt(i);
		 
		
	}
	 System.out.println("reverse of a string : " + str2);
	
	}
	public static void main(String[] args) 
	{
		reverseofastring1 aa=new reverseofastring1();
		aa.display();
		
	}
	     

}
