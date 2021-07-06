package corejava;

public class palindrome 
{
	public static void main(String[] args) 
	{
		int r,sum=0,temp;
		int n=454;
		temp=n;
		while(n>0)
			{
			   r=n%10;//gettng reminder
			   sum=(sum*10)+r;
			   n=n/10;
			   
			}
		if (temp==sum) 
		{
			System.out.println("palindromenumber");
			
		}
		else
		{
			System.out.println("Not a palindrome");
			
			
			
			
			
			
			
			
		}
		
	}

}
