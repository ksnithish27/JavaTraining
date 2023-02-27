import java.util.Scanner;
class Box2
{
	private double width;
	private double height;
	private double depth;

public Box2(){
	width = height = depth=0;
}
public Box2(double w, double h, double d){
	width = w;
	height =h;
	depth = d;
}
public void volume(){
	System.out.println("Volume = "+width*depth*height);
}
}

public class Box2use
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Box2 b1= new Box2();
		b1.volume();
		System.out.println("Enter the value of width");
		double width = sc.nextDouble();
		System.out.println("Enter the value of height");
		double height =sc.nextDouble();
		System.out.println("Enter the value of depth");
		double depth =sc.nextDouble();
		Box2 b2 = new Box2(width,height,depth);
		b2.volume();
	}
		
		
}
