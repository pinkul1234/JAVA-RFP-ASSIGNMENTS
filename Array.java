import java.util.*;
class Array{
	public static void main(String arg[]){
		int m[][]=new int[3][4];
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number in matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<4;j++)
			{
				System.out.println(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}
		
	