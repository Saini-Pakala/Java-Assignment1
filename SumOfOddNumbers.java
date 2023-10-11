package package2;

public class SumOfOddNumbers 
{
public static void main(String[] args) 
 {
	int sum=0;
	for(int i=7;i<=21;i++)
	{
		if(i%2!=0)
		{
			sum=sum+i;
		}
	}
	System.out.println("The Sum of Odd Numbers between 7 & 21 is: "+sum);
 }
}
