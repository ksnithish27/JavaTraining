// program to accept day number and display day
import java.util.Scanner;
public class Program305b
{
	public static void display_day(int day_no){
		String s = new String();
		switch(day_no){
		case 0: {
			System.out.println("Sunday");
			break;
		}
		case 1:{
		System.out.println("Monday");
		break;
		} 
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4:{
			System.out.println("Thursday");
			break;
		} 
		case 5:{
			System.out.println("Friday");
			break;
		} 
		case 6:{
			System.out.println("Saturday");
			break;
		}
		default :{
			System.out.println("Enter proper value");
			break;
		}
	}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number");
		int day_no = sc.nextInt();
		display_day(day_no);
		}
	}
