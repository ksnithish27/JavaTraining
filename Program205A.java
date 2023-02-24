import java.util.*;
public class Program205A
{
	public static boolean isChar(char ch){
		if((ch>='a' && ch<='z')||(ch>='A'&& ch<='z')){
			return true;
		}
		else{
			return false;
		}
	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Charecter");
		char ch =sc.next().charAt(0);
		if(isChar(ch)){
			System.out.println(ch+" is a Charecter");
		}
		else{
			System.out.println(ch+" is not a Charecter");
		}
		
	}
}
