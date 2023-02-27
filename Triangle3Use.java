import java.util.Scanner;
class Triangle3 
{
	double height;
	double base;
}
public class Triangle3Use
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Triangle3 t1 = new Triangle3();
		System.out.println("Enter the base value of a triangle");
		t1.base = sc.nextDouble();
		System.out.println("Enter the height value of a triangle");
		t1.height = sc.nextDouble();
		double area = 0.5*t1.height*t1.base;
		System.out.println(area);
		


	}
}
