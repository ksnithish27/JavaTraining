import java.util.Scanner;
class Box1
{
	double width;
	double height;
	double depth;
}
public class Box1use
{
	public static void main(String[] args) 
	{
		Box1 b1= new Box1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of width");
		b1.width = sc.nextDouble();
		System.out.println("Enter the value of height");
		b1.height =sc.nextDouble();
		System.out.println("Enter the value of depth");
		b1.depth =sc.nextDouble();
		double volume = b1.width*b1.height*b1.depth;
		System.out.println("Volume = "+volume);
	}
}
