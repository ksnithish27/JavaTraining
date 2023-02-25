// java program to find perimeter of Circle
import java.util.Scanner;
public class Program307a 
{
	public static double perimeter_circle(double radius){
		return Math.PI*radius*2;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius value");
		double radius = sc.nextDouble();
		System.out.println("Perimeter of circle = "+perimeter_circle(radius));
	}
}
