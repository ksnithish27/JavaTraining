// java program to evaluate the sum of n natural numbers using for loop
import java.util.*;
public class Exfor5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		for(int i = n;i>=1;i--){
			sum +=i;
		}
		System.out.println(sum);
	}
}
