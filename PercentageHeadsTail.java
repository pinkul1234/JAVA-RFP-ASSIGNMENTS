import java.util.*;

public class PercentageHeadsTail{

	public static void main(String arg[]){
		int number=0;
		Scanner sc=new Scanner(System.in);
		 PercentageHeadsTail percentageHeadsTail=new PercentageHeadsTail();
		 
			do{
				System.out.println("Enter number of times to Flip Coin:");
				number=sc.nextInt();
			}while(!percentageHeadsTail.ValidatePositiveNumber(number));
		
		int tail = percentageHeadsTail.numberOfTail(number);
		double percentageTial = percentageHeadsTail.percentageOfTail(tail,number);

		System.out.println("Percentage of time tial :"+percentageTial);
		System.out.println("Percentage of time Head :"+(100-percentageTial));
	}

	public int numberOfTail(int number){
		int tail=0;
		Random random=new Random();
		for(int i=0;i<number;i++){
			if(random.nextInt()<0.5)
				tail++;
		}
		return tail;
	}

	public double percentageOfTail(int tail,int number){
		return (100*tail)/number;
		
	}

	public boolean ValidatePositiveNumber(int number){
		if(number>0)
			return true;
		else
			return false;
	}

}