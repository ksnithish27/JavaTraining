import java.util.*;
public class Program208A 
{
	public static int diff(int a, int b){
		return a-b;
	}
	public static int prod(int a, int b){
		return a*b;
	}
	public static int smaller(int a, int b)
	{
		if(a==b){
			return 0;
		}
		else if(a<b){
			return a;
		}
		else {
			return b;
		}
	}
	public static int larger(int a, int b)
	{
		if(a==b){
			return 0;
		}
		else if(a>b){
			return a;
		}
		else {
			return b;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of a");
		int a = sc.nextInt();
		System.out.println("Enter the value of b");
		int b = sc.nextInt();
		int difference = diff(a,b);
		System.out.println("diffrence = "+difference);
		int product = prod(a,b);
		System.out.println("Product = "+product);
		System.out.println("smaller = "+smaller(a,b));
		System.out.println("larger = "+larger(a,b));
	}
}
