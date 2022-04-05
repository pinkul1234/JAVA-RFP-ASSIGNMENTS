import java.util.*;
class Palindrome 
{
	public static void main(String arg[]) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int n = sc.nextInt();
	int r=0;
	int d=0;
	int i;
	for(i=n;i!=0;i=i/10)
		{
			d=i%10;
			r=(r*10)+d;
		}
		if(n==r)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}