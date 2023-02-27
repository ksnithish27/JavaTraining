// java program to find area of a traingle by taking user inputs for both base and height
import java.util.Scanner;
public class AreaTraingle 
{
	public static float areaTriangle(float a, float b){
		return (1.0f/2.0f)*a*b;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the base value of a triangle");
	float base = sc.nextFloat();
	System.out.println("Enter the value of heigth of a traingle");
	float height = sc.nextFloat();
	System.out.println("Area of a triangle with base "+base+" height "+height +" is "+areaTriangle(base,height)+" sq units ");
	
	}
}