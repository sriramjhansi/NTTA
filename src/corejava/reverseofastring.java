package corejava;

public class reverseofastring {

	public void display()
	{
		String str="jhansi";
		char c=str.charAt(1);
		System.out.println(c);
		String str1=" ";
		int len =str.length();
		System.out.println(len);
		
		for (int i=len-1;i>=0;i--)
		{
			str1= str1+str.charAt(i);
			
		}
		
		//3. by using string buffer also we can reverse it  
		//StringBuffer sb=new StringBuffer(str);
		//System.out.println(sb.reverse());
		System.out.println("reversed of a string is :"+ str1);
		
	}
	public static void main(String[] args) 
	{
		reverseofastring aa=new reverseofastring();
		aa.display();
		
	}
}
	