import java.util.*;
public class PowerOfTwo{
	
	public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	int number;
		PowerOfTwo powerOfTwo=new PowerOfTwo();

		do{
			System.out.println("Enter Number :");
			number=sc.nextInt();
		}
		while(!powerOfTwo.checkNumberLessthen31(number));
		powerOfTwo.printPowerOfTwo(number);
	}

	public boolean checkNumberLessthen31(int number){
		if(number>31)
			return false;
		else
			return true;
	}

	public void printPowerOfTwo(int number){
		for(int i=0;i<number;i++){
			System.out.println("2 ^ "+i+" "+Math.pow(2,i));
			
		}
	}
}