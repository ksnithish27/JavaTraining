// java program to find greatest of three numbers
import java.util.Scanner;
public class Program310b  
{
	public static int greatnum(int a, int b, int c){
		return ((a>b)&&(a>c))? a : ((b>a)&&(b>c))? b: ((c>a)&&(c>b))? c:a;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of a,b&c");
		int a = sc.nextInt(),b = sc.nextInt(),c=sc.nextInt();
		System.out.println(greatnum(a,b,c));

	}
}
