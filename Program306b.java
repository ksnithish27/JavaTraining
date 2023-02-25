// program to accept month number and month name
import java.util.Scanner;
public class Program306b
{
	public static void displayMonth(int month_no){
		String s = new String();
		if (month_no==1) s = "January";
		else if (month_no==2) s = "February";
		else if (month_no==3) s = "March";
		else if (month_no==4) s = "April";
		else if (month_no==5) s = "May";
		else if (month_no==6) s = "June";
		else if (month_no==7) s = "July";
		else if (month_no==8) s = "August";
		else if (month_no==9) s = "September";
		else if (month_no==10) s = "October";
		else if (month_no==11) s = "November";
		else if (month_no==12) s = "December";
		else if((month_no>12)||(month_no<0)) s= "Incorrect Month number";
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
