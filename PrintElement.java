import java.util.*;
class PrintElement{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int i,t;
		int list[]=new int[10];
		System.out.println("Enter 10 number");
		for(i=0;i<10;i++)
		{
			list[i]=sc.nextInt();
		}
		t=list[9];
		for(i=8;i>=0;i--)
		{
			list[i+1]=list[i];
		}
		list[0]=t;
	    for(i=0;i<10;i++)
		{
			System.out.println(list[i]);
		}
	}
}