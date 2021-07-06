package corejava;

public class logicaloperators
{
	public void display(int a,int b)
	{
		if (a==b) 
		{
			System.out.println("both are equal");
			
		}
		else
		{
			System.out.println("both are not equal");
		}
		
		
		
	}
	public static void main(String[] args) 
	{
		logicaloperators bb=new logicaloperators();
		bb.display(10, 10);
		
	}

}

//doubt
//relational operator--(a==b,a!=b,a>b,a>=b,a<=b)