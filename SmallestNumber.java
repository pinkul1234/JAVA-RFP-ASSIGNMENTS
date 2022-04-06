import java.util.*;
class SmallestNumber 
{
    public static void main(String arg[]) 
    {
        int n, sm;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        sm = a[0];
        for(int i = 0; i < n; i++)
        {
            if(sm > a[i])
            {
                sm = a[i];
            }
        }
        System.out.println("Smallest number is: "+sm);
    }
}