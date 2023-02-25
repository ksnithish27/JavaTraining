//program to swap two numbers with using 3rd variable
import java.util.*;
public class Program304b
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two numbers");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int temp =n;
		n = m;
		m=temp;
		System.out.println(n);
		System.out.println(m);
	}
}
