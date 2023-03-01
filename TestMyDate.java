class MyDate  
{
	public int day;
	public int month;
	public int year;
	public void display(){
		System.out.println(day+"-"+month+"-"+year);
	}//display()
}//MyDate
public class TestMyDate
{
	public static void main(String[] args) 
	{
		MyDate d1 = new MyDate();
		d1.day = 10;
		d1.month = 10;
		d1.year = 2010;
		d1.display();
	}//main()
}//TestMyDate
