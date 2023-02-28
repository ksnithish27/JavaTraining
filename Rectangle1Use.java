import java.util.Scanner;
class Rectangle1 
{
	private double length;
	private double breadth;

	public Rectangle1(){
		length = breadth =0;
	}
	public Rectangle1(double l, double b){
		length = l;
		breadth = b;

	}
	public  void areaRectangle(){
		System.out.println("Perimeter of a rectangle with length "+length+" breadth "+breadth +" is "+(2*(length+breadth))+" sq units ");
	}
}
public class Rectangle1Use
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length value of a triangle");
		double length = sc.nextDouble();
		System.out.println("Enter the breadth value of a triangle");
		double breadth = sc.nextDouble();
		Rectangle1 r1 = new Rectangle1();
		r1.areaRectangle();
		Rectangle1 r2 = new Rectangle1(length,breadth);
		r2.areaRectangle();


	}
}
