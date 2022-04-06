import java.util.*;
class ReverseOrder {
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter size of the Array");
	int arr[];
	int size = sc.nextInt();
	arr = new int[size];
	for(int i:arr){
	}		
	
	System.out.println("\n Enter Elements");
	for(int i=0;i<arr.length;i++){
	   arr[i]=sc.nextInt();
	}
	System.out.println("\n In reverse order");
	for(int i=arr.length-1;i>=0;i--) 
	{
	System.out.print(arr[i]+" ");
      }
  } 
}
