package corejava;

public class exceptions 
{
	public void diplay()
	{
		
		//arithmatic exception
		
		try
		{
			int b=5/4;
			int a[]=new int[5];  //it will handle only one exception what we have given first
	          a[6]=20;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		
//		int a=5/0;
//		System.out.println("exception hamdled");
	
		
//arrayondexoutofboundexception
		
/*try {
	int a[]=new int[5];
	 a[6]=20;
	
}
catch (Exception e) //if we give arithmatic exceptions it wont handle excceptions we have to give exception or arrayindexoutofboundexception
{
	System.out.println(e);
}*/
	
		// numberformateexception
		/*try 
		{
			
			  String str="hello";
			  int num=Integer.parseInt(str);//we are doing typecasting string to integer.
			  
			  
			
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}*/
		
		
		//Nullpointer exception
	/*	try 
		{
			String str=null;
			System.out.println(str.length());
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}*/
		
		//String str=null;
		//System.out.println(str.length());//it will throw null pointer exception

		
		
System.out.println("exception handled");
		
	}
	public static void main(String[] args) 
	{
		exceptions aa=new exceptions();
		aa.diplay();
		
	}

}
