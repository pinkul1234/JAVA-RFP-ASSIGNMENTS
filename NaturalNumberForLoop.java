import java.util.*;
class NaturalNumberForLoop
{
	public static void main(String arg[]) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number");
	int number = sc.nextInt();
	int i,sum=0;
	for(i=0;i<=number;i++)
	{
	sum+=i;
	}
	System.out.println("Sum Of Natural Number Is: "+sum);
     }
}