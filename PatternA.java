import java.util.Scanner;

class PatternA 
{
	public 
	public static void decPattern(int a, char ch){
		for(int i = 0;i<a;i++){
			for(int j = a;j>i;j--){
				System.out.print(ch);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for n");
		decPattern(sc.nextInt(),'#');
		System.out.println("Enter the value for n");
		decPattern(sc.nextInt(),'*');
	}
}
