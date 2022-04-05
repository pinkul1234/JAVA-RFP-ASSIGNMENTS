import java.util.*;
class ReverseForLoop
 {
	public static void main(String args[]) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number: ");
	int number= sc.nextInt();
	int reverse=0;
	int rem=0;
	int i;
	for(i=number; number>0; number/=10)
	{
	rem = number % 10;
	reverse = reverse * 10 + rem;
	}
	System.out.println("The Reverse number is: "+reverse);
    }
}