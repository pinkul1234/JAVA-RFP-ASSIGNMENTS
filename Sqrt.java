import java.util.*;
class Sqrt{
	public static double sqrt(double c) {
		
		  double epsilon = 1e-15;
	        double t = c;             

	        while (Math.abs(t - c/t) > epsilon*t) {
	            t = (c/t + t) / 2.0;
	        }
	  
	        return t;
	        }
	public static void main(String arg[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	double n=sc.nextDouble();
	double number=Sqrt.sqrt(n);
	System.out.println(number);
	}

   }