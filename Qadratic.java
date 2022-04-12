import java.util.*;
class Qadratic {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		double a=sc.nextDouble();
		System.out.println("Enter value of b:");
		double b=sc.nextDouble();
		System.out.println("Enter value of c:");
		double c=sc.nextDouble();
		double delta=b*b-4*a*c;
		double root1=(-b + Math.sqrt(delta))/(2*a);
		double root2=(-b - Math.sqrt(delta))/(2*a);
		System.out.println("Root1: "+root1);
		System.out.println("Root2: "+root2);
	}
}