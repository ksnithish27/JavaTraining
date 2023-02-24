import java.util.*;
public class Program206A 
{
	public static int asciiVal(char ch){
		return (int)ch;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		char ch = sc.next().charAt(0);
		System.out.println(asciiVal(ch));
	}
}
