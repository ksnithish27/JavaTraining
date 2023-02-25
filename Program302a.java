// to check odd even in methods using AND operator
import java.util.*;
public class Program302a
{
	public static int isEvenOdd(int n){
		return (n & 1);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		if(isEvenOdd(n)==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}
