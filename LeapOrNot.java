class LeapOrNot
  {
   public static void main(String arg[])
  {
  int y=1582;
  if(y%4==0 && y%100!=0 && y%400==0)
         {
	     System.out.println("\n 1582 It is a leap year");
         }
	else 
	{
             System.out.println("\n 1582 It is not a leap year");
        }
    }
  }
