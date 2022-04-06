import java.util.*;
class OddPosition {
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the size of the Array");
	int arr[];
	int size = sc.nextInt();
	arr = new int[size];

	for(int i:arr) {
	}

	System.out.println("\nEnter elements:  ");
	for(int i=0;i<arr.length;i++){
	   arr[i]=sc.nextInt();
	}

	for(int i=0;i<arr.length;i++) {

         if(arr[i] % 2 !=0){
	     System.out.println("Odd element is: "+arr[i]);
	   }
      }
  } 
}