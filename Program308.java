// java program to find area of a square
import java.util.Scanner;
public class Program308 
{
	public static int area_rectangle(int l, int b){
		return l*b;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of length & breadth");
		int length=sc.nextInt(),breadth = sc.nextInt();
		int area = area_rectangle(length,breadth);
		System.out.println("Area of rectangle is "+area);
	}
}
