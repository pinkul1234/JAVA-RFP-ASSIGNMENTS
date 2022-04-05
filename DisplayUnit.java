import java.util.*;
class DisplayUnit 
{
	public static void main(String arg[]) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER UNIT 1 TO 10000: ");
	int unit=sc.nextInt();
	if(unit==1) 
	{
	System.out.println("ONE");
	}
	else if(unit==10) 
	{
	System.out.println("TEN");
	}
	else if(unit==100) 
	{
	System.out.println("HUNDRED");
	}
	else if(unit==1000) 
	{
	System.out.println("ONE THOUSAND");
	}
	else if(unit==10000) 
	{
	System.out.println("TEN THOUSAND");
	}
	else 
	{
	System.out.println("Plz Enter valid unit");
	}
   }
}