import java.util.*;
class PerfectNumber {
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	int sum=0;
	if(n > 0)
	{
	  for(int i=1;i<n;i++) {
	    if(n % i == 0) {
	     sum+=i;
	    }
	  }
	  if(n==sum) {
	  System.out.println(n + " is a perfect number");
       }
	 else {
	 System.out.println(n + " is not a perfect number");
       }
	}
    }
}
	
	