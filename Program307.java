// java program to find area of Circle
import java.util.Scanner;
public class Program307 
{
	public static double area_circle(double radius){
		return Math.PI*Math.pow(radius,2);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius value");
		double radius = sc.nextDouble();
		System.out.println("Area of circle = "+area_circle(radius));
	}
}
