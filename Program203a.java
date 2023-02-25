// to check even odd by compliment in a variable loop
import java.util.*;
public class Program303a
{
	public static boolean isEvenOdd(int n){
		boolean Even_no = true;
		for(int i = 1;i<n;i++){
			Even_no = !Even_no;
			return Even_no;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n= sc.nextInt();
		if(isEvenOdd(n)){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}
