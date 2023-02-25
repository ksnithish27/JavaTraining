// program to accept day number and display day
import java.util.Scanner;
public class Program305
{
	public static void display_day(int day_no){
		String s = new String();
		if (day_no==0) s = "Sunday";
		if (day_no==1) s = "Monday";
		if (day_no==2) s = "Tuesday";
		if (day_no==3) s = "Wednesday";
		if (day_no==4) s = "Thursday";
		if (day_no==5) s = "Friday";
		if (day_no==6) s = "Saturday";
		if((day_no>6)||(day_no<0)) s= "Incorrect day number";
		System.out.print("Day is "+s);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number");
		int day_no = sc.nextInt();
		display_day(day_no);
		}
	}
