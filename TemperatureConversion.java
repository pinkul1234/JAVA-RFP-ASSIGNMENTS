import java.util.*;
class TemperatureConversion
{
public static void main(String arg[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter fahrenheit ");
	double fahrenheit=sc.nextDouble();
	System.out.println("Enter celsius");
	double celsius=sc.nextDouble();
	celsius=((fahrenheit-32)*5)/9;
	System.out.println("Fahrenheit \t Celsius");
	System.out.println("============================");
	System.out.println(fahrenheit+"\t\t\t"+celsius);
	fahrenheit=(celsius * 9/5) + 32; 
	System.out.println("Celsius \t Fahrenheit");
	System.out.println("============================");
	System.out.println(celsius+"\t\t\t"+fahrenheit);

}
}