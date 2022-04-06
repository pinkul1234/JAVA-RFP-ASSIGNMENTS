import java.util.*;
class FrequencyNum
{
    public static void main(String arg[])
    {
        int arr[] = {12, 22, 34, 22, 54, 6, 52, 8, 9, 34, 54, 68,10,20,30,20,30,50,10,50,30,20};
        int freq[] = new int[arr.length];
        Arrays.fill(freq, -1);
        System.out.println("The array elements are "+Arrays.toString(arr));
        
       frequency(arr,freq);
    }
    
    static void frequency (int arr[], int freq[])
    {
        int count;
        for(int i = 0; i<arr.length; i++)
        {
            count=1;
            for(int j = i + 1; j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    freq[j] = 0;
                }
            }
            if(freq[i]!=0)
            {
                freq[i] = count;
            }
        }
        
        System.out.println("The elements and their occurences are");
        for(int i = 0; i<arr.length;i++)
        {
            if(freq[i]>=1)
                System.out.println("Element "+arr[i]+" has occured "+freq[i]+" times.");
        }
    }
}