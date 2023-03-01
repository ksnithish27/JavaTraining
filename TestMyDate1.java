import java.util.Scanner;
class MyDate1 
{
	private int day;
	private int month;
	private int year;
	public void set_Day(int day){
		this.day = day;
	}//setday()
	private int get_Day(){
		return day;
	}//getDate
	public void set_Month(int month){
		this.month = month;
	}//getMonth
	private int get_Month(){
		return month;
	}//getMonth
	public void set_Year(int year){
		this.year = year;
	}//setYear()
	private int get_Year(){
		return year;
	}//getYear
	public  void display_Date(){
		System.out.println("The date you have entered is "+get_Day()+"/"+get_Month()+"/"+get_Year());
	}//displayDate
}//MyDate1
public class TestMyDate1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		MyDate1 d1 = new MyDate1();
		System.out.println("Enter Day");
		d1.set_Day(sc.nextInt());
		System.out.println("Enter Month");
		d1.set_Month(sc.nextInt());
		System.out.println("Enter Year");
		d1.set_Year(sc.nextInt());
		d1.display_Date();
		}//main()
}//My date
