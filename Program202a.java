import java.util.*;
public class Program202a
{
	public static boolean isEvenOdd(int n){
	if(n%2==0){
		return true;
	}
	else{
		return false;
	}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);

		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		if(isEvenOdd(n)){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}

	}
}
