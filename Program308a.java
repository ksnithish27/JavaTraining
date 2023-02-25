// java program to find perimeter of a rectangle
import java.util.Scanner;
public class Program308a 
{
	public static int perimeter_rectangle(int l, int b){
		return 2*(l+b);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of length & breadth");
		int length=sc.nextInt(),breadth = sc.nextInt();
		int perimeter = perimeter_rectangle(length,breadth);
		System.out.println("perimeter of rectangle is "+perimeter);
	}
}
