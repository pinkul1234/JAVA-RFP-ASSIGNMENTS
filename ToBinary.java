import java.util.*;
public class ToBinary{
	public static void main (String arg[])
	{
		System.out.println("Program to convert Decimal to Binary");
		System.out.println("====================================\n");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Decimal Number:");
		int number=s.nextInt();
		int n=number;
		StringBuilder output=new StringBuilder(); 
		if(n==0)
		{
		output.append("0");
		}
		else
		{
		while(n>0)
		{
			output.append(String.valueOf(n%2));
			n=n/2;
		}}

		System.out.println("Binary Equivalent for the given Decimal number - "+number+" : "+Integer.toBinaryString(number));
	}

}