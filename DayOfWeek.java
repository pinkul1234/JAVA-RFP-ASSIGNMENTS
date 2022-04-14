public class DayOfWeek 
{

	public static void main(String arg[]) 
	{
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		switch (dayOfWeek(day, month, year)) 
		{
		case 0:
			System.out.println("SUnday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("WednessDay");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Invalid Output");
			break;
		}
	}


	private static int dayOfWeek(int day, int month, int year) 
	{
		int y = year - (14 - month)/12;
		int x = y + y/4 - y/100 + y/400;
		int m = month + 12*((14 - month)/12)-2;
		//int d = (day + x + 31*m/12) % 7;
		return (day + x + 31*m/12) % 7;
	}

}