// program to check positive or negative
import java.util.*;
public class Program301  
{			
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num == 0){
			System.out.println("Neither positive nor negative");
		}
		else if(num<0){
			System.out.println("Negative");
		}
		else{
			System.out.println("Positive");
		}
	}
}
