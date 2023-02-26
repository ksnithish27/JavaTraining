// java program for if elsee example understanding
import java.util.*;
class Else_if_Example1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of i & j ");
		int i = sc.nextInt(),j = sc.nextInt();
		if(j==0) System.out.println("Divisibility by zero is error");
		else System.out.println(i+" divisible by "+j+" is "+(i/j));
	}
}
