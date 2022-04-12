import java.util.*;
public class PrimeFactor{
	public static void main(String arg[]){
		System.out.println("Enter Number :");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println("Prime factor of "+number+" is :");
		findPrimeFactor(number);
	}
	
	public static void findPrimeFactor(int number){
		for(int i=1;i*i<=number;i++){
			if(number%i==0)
				System.out.print(" "+i);
		}
	}
}