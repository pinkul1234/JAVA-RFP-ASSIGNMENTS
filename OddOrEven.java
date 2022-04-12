import java.util.*;
class OddOrEven
{
	public static void main(String arg[])
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Even: "+a);
			
		}
		else
		{
			System.out.println("Odd: "+a);
		}
	}
}