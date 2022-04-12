import java.util.*;
class Largest{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int x,y,z,big;
		System.out.println("Enter any 3 numbers: ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>y)
		{
			if(x>z)
			{
				big=x;
			}
			else
			{
				big=z;
			}
		}
		else{
			if(y>z)
			{
				big=y;
			}
			else{
				big=z;
			}
		}
		System.out.println("Largest no is= "+big);
	}
}