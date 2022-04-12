import java.util.*;
 class SwapNumber
 {
  public static void main(String arg[])
  {
	  int a,b,c;
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter any two numbers");
	  a=sc.nextInt();
	  b=sc.nextInt();
	  c=a;
	  a=b;
	  b=c;
	  System.out.println("Swap number is"+a);
	  System.out.println("Swap number is"+b);
  }
 }