// program to accept month number and month name
import java.util.Scanner;
public class Program306a
{
	public static void displayMonth(int month_no){
		String s = new String();
		if (month_no==1) s = "January";
		if (month_no==2) s = "February";
		if (month_no==3) s = "March";
		if (month_no==4) s = "April";
		if (month_no==5) s = "May";
		if (month_no==6) s = "June";
		if (month_no==7) s = "July";
		if (month_no==8) s = "August";
		if (month_no==9) s = "September";
		if (month_no==10) s = "October";
		if (month_no==11) s = "November";
		if (month_no==12) s = "December";
		if((month_no>12)||(month_no<0)) s= "Incorrect Month number";
		System.out.print("Month is "+s);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month number");
		int month_no = sc.nextInt();
		displayMonth(month_no);
		}
	}
