import java.util.*;
class EvenPosition {
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
	for(int i=0;i<arr.length;i++) {

         if(arr[i] % 2 ==0){
	     System.out.println("Even element in the array: "+arr[i]);
	   }
      }
  } 
}