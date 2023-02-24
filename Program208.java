import java.util.*;
public class Program208
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		int difference = a-b;
		System.out.println("Difference = "+ difference);
		int product = a*b;
		System.out.println("Product = "+product);
		if(a==b){
			System.out.println("a equals b");
		}
		else if(a>b){
			System.out.println("a is greater");
		}
		else{
			System.out.println("b is greater");
		}


	}
}
