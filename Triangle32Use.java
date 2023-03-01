// write a java codef area and perimeter of a triangle
import java.util.*;
class Triangle3
{
	private double base;
	private double height;
	private double  a;
	private double  b;
	private double  c;


	public Triangle3(double base, double height){
		this.base = base;
		this.height = height;
	}

	public Triangle3(double a,double b,double c){
		this.a = a;
		this.b = b;
		this.c=c;
	}
	

	public  void areaOfTriangle(){
		System.out.println( "Area of the Triangle is = "+(0.5)*base*height);
	}
	
	public  void perimeterofTriangle(){
		System.out.println("Perimeter of the Triangle is = "+(a+b+c));
	}
}
public class Triangle32Use
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the Triangle");
		double base = sc.nextDouble();
		System.out.println("Enter the height of the Triangle");
		double height = sc.nextDouble();
		
		Triangle3 t1 = new Triangle3(base,height);
		t1.areaOfTriangle();
		System.out.println("Enter the side a of the Triangle");
		double a = sc.nextDouble();
		System.out.println("Enter the side b of the Triangle");
		double b = sc.nextDouble();
		System.out.println("Enter the side c of the Triangle");
		double c = sc.nextDouble();
		Triangle3 t2 = new Triangle3(a,b,c);
		t2.perimeterofTriangle();
		
	}
}
