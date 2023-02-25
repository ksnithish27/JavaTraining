// program to check positive Negative using methods
import java.util.*;
public class Program301A 
{
	public static void checkPositiveNegative(int n){
		if(n == 0){
			System.out.println("Neither positive nor negative");
		}
		else if(n<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Positive");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num value");
		int num = sc.nextInt();
		checkPositiveNegative(num);
	}
}
