// java program to find greatest of three numbers
import java.util.Scanner;
public class Program310   
{
	public static int greatestNum(int a, int b, int c){
		if((a==b) && (b==c)){
			return a;
		}
		else if((a>b)&&(a>c)){
			return a;
		}
		else if((b>a)&&(b>c)){
			return b;
		}
		else if((c>a)&&(c>b)){
			return c;
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values of a,b&c");
		int a = sc.nextInt(),b = sc.nextInt(),c=sc.nextInt();
		System.out.println("Greatest number is "+ greatestNum(a,b,c));

	}
}
