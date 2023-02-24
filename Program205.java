import java.util.*;
class Program205
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Charecter");
		char ch = sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A'&& ch<='z')){
			System.out.println(ch+" is a Charecter");
		}
		else{
			System.out.println(ch+" is not a charecter");
		}
	}
}
