import java.util.*;
class FibonacciSeries {
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n = sc.nextInt();
	int a=0;
	int b=1;
	int count=2;
	while(count<=n) {
	int temp=b;
	b=b+a;
	a=temp;
	count++;
	}
	System.out.println(b);
    }
}