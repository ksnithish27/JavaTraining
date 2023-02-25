//java program to find perimeter of a square
import java.util.Scanner;
public class Program309a
{
	public static int perimeter_square(int s){
		return 4*s ;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of side of square");
		int side=sc.nextInt();
		int perimeter =  perimeter_square(side);
		System.out.println("perimeter of square is "+perimeter);
	}
}