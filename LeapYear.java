import java.util.*;
class LeapYear 
  { 
   public static void main(String arg[]) 
  {   
  int y; 
  Scanner obj=new Scanner(System.in);   
  System.out.println("\nEnter any year :- ");   
  y=obj.nextInt(); 
  if((y%4==0  && y%100!=0) || (y%400==0))
    { 
 	 System.out.println("It is a leap year"); 
    } 
 	else  
 	{ 
          System.out.println("It is not a leap year"); 
        } 
    } 
  } 