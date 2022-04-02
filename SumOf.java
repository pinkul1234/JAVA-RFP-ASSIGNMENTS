class SumOf
{
public static void main (String arg[])
{
int num, count=0, sum=0;
for(int i=0;i<arg.length;i++)
{
try
{
num=Integer.parseInt(arg[i]);
sum= sum+num;
}
catch (NumberFormatException e)
{
count++;
}
}
System.out.println("Sum of only valid integers is= "+sum) ;

System.out.println("Invalid integers are: "+count) ;
}
}