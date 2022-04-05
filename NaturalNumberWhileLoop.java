import java.util.*;
class NaturalNumberWhileLoop
{
	public static void main(String arg[]) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number: ");
	int number=sc.nextInt();
	int sum=0;
	int i=0;
	while(i<=number) 
	{
	sum+=i;
	i++;
	}
	System.out.println("Sum Of Natural Number Is: "+sum);
    }
}