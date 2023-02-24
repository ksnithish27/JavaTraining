import java.util.*;
public class Program207A 
{
	public static void typeofChar(char ch){
		if(ch>=65 && ch<=90){
			System.out.println("Upper");
		}
		else if(ch>=97 && ch<=122){
			System.out.println("Lower");
		}
		else if(ch>=48 && ch<=57){
			System.out.print("Number");
		}
		else{
			System.out.println("Symbol");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any value");
		char ch = sc.next().charAt(0);
		typeofChar(ch);
	}
}
