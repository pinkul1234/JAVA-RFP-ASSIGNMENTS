import java.util.*;
class VowelConsonant
{
	public static void main(String arg[]) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the alphabet: ");
	char  alphabet = sc.next().charAt(0);
	switch(alphabet) 
	{
	case 'a':
	   System.out.println(alphabet + " is a vowel");
	   break;
	case 'e':
	   System.out.println(alphabet + "is a vowel");
	   break;
	case 'i':
	   System.out.println(alphabet + " is a vowel");
	   break;
	case 'o':
	   System.out.println(alphabet +" is a vowel");
	   break;
	case 'u':
	   System.out.println(alphabet +" is a vowel");
	   break;
	case 'A':
	   System.out.println(alphabet + " is a vowel");
	   break;
	case 'E':
	   System.out.println(alphabet + "is a vowel");
	   break;
	case 'I':
	   System.out.println(alphabet + " is a vowel");
	   break;
	case 'O':
	   System.out.println(alphabet +" is a vowel");
	   break;
	case 'U':
	   System.out.println(alphabet +" is a vowel");
	   break;

	default:
	System.out.println(alphabet +" is a consonant");
	break;
      }
    }
}