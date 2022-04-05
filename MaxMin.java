import java.util.*;
class MaxMin
{
	public static void main(String arg[]) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of a: ");
	int a = sc.nextInt();
	System.out.println("Enter value of b: ");
	int b = sc.nextInt();
	System.out.println("Enter value of c: ");
	int c = sc.nextInt();

	int operator1=a+b*c;
	int operator2=c+a/b;
    int operator3=a%b+c;
    int operator4=a*b+c;

      System.out.println("------- Maximum ---------");
      if((operator1>operator2)&&(operator1>operator3)&&(operator1>operator4)) 
	   {
            System.out.println("Operator1 is maximum: "+operator1);
       }             
        else if((operator2>operator3)&&(operator2>operator4)) 
		{
            System.out.println("operator2 is maximum: "+operator2);
        }
        else if(operator3>operator4) 
		{
            System.out.println("operator3 is maximum: "+operator3);
        }
        else 
		{
            System.out.println("operator4 is maximum: "+operator4);
        }
		System.out.println("------- Minimum ---------");

		if((operator1<operator2)&&(operator1<operator3)&&(operator1<operator4)) 
		{
            System.out.println("operator1 is minimum: "+operator1);
        }             
        else if((operator2<operator3)&&(operator2<operator4)) 
		{
            System.out.println("operator2 is minimum: "+operator2);
        }
        else if(operator3<operator4) 
		{
            System.out.println("operator3 is minimum: "+operator3);
        }
        else 
		{
            System.out.println("operator4 is minimum: "+operator4);
        }
     }
}