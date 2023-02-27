import java.util.Scanner;
class Triangle2 
{
	private double height;
	private double base;

	public Triangle2(){
		base = height =0;
	}
	public Triangle2(double h, double b){
		height = h;
		base = b;

	}
	public void areaTriangle(){
		System.out.println("Area of a triangle with base "+base+" height "+height +" is "+(0.5*base*height)+" sq units ");
	}
}
public class Triangle2Use
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value of a triangle");
		double base = sc.nextDouble();
		System.out.println("Enter the height value of a triangle");
		double height = sc.nextDouble();
		Triangle2 t1 = new Triangle2();
		t1.areaTriangle();
		Triangle2 t2 = new Triangle2(4,4);
		t2.areaTriangle();


	}
}
