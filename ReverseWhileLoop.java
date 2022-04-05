import java.util.*;
class ReverseWhileLoop 
{
	public static void main(String arg[]) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int number=sc.nextInt();
	int reverse=0;
	int rem=0;
 	while(number > 0) {
	rem=number%10;
	reverse=reverse*10+rem;
	number/=10;
	}
	System.out.println("The Reverse number is: "+reverse);
	}
}
	