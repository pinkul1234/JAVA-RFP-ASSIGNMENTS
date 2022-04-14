import java.util.*;
class PrimeNumber
{
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
		int i,x,n=0;
		System.out.println("Enter any number");
		x=sc.nextInt();	
		for(i=1;i<=x/2;i++)
		{
			if(x%i==0)
			{
				n=n+1;
			}
		}
			if(n==1)
			{
				System.out.println("it is a prime number");
			}
			else
			{
				System.out.println("it is not a prime number");
			}
	}
}