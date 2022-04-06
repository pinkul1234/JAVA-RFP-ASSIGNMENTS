import java.util.*;
class DuplicateNumber {    
public static void main(String arg[]) {   
        int [] arr = new int [] {10, 20, 30, 40, 20, 70, 80, 80, 30};  
        System.out.println("Duplicate elements in given array: ");  
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  


