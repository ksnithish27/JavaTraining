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

	public  void areaOfTriangle(double base, double height){
		System.out.println( (0.5)*base*height);
	}
	
	public  void perimeterofTriangle(double a, double b, double c){
		System.out.println(a+b+c);
	}
}
public class Triangle32Use
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		Triangle3 t1 = new Triangle3(base,height);
		t1.areaOfTriangle();
		Triangle3 t2 = new Triangle3(a,b,c);
		t2.perimeterofTriangle();
	}
}
