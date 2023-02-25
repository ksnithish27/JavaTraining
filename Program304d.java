//program to swap two numbers without using 3rd variable using multiplication & div
import java.util.*;
public class Program304d
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers");
		int n = sc.nextInt();
		int m = sc.nextInt();
		n = n*m;
		m = n/m;
		n = n/m;
		System.out.println(n);
		System.out.println(m);
	}
}
