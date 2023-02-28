import java.util.*;
class Calculate 
{
	static int cube(int x){
		return x*x*x;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(cube(n));
	}
}
