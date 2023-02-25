// java program to find area of a square
import java.util.Scanner;
public class Program309 
{
	public static int area_square(int s){
		return s*s ;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of side of square");
		int side=sc.nextInt();
		int area = area_square(side);
		System.out.println("area of square is "+area);
	}
}
