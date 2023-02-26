// java program to check odd even with out using %
import java.util.Scanner;
public class Program201
{
	public static boolean isEvenOdd(int n){
		return ((n/2*2)==n);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(isEvenOdd(a)){
			System.out.println("Even");
		}
		else{
			System.out.println("ODD");
		}

	}
}