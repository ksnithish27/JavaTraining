import java.util.*;
public class Program206  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		char ch = sc.next().charAt(0);
		int ascii = (int)ch;
		System.out.println("AsSCII of "+ch+" is "+ascii);
	}
}
