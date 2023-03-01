// java program to find sum of digits using number
import java.util.*;
class Number1 
{
	private int n;
	public void setNum(int n){
		this.n = n;
	}//setNum
	public int getNum(){
		return n;
	}//getNum()
	public int sumDigits(){
		int temp = this.n;
		int sum = 0,rem;
		while(temp>0){
			rem = temp%10;
			sum+=rem;
			temp =temp/10;
		}//while
		return sum;

	}// sumDigits()
}//Number1
public class TestNumber1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Number1 n1 = new Number1();
		System.out.println("Enter the number");
		n1.setNum(sc.nextInt());
		System.out.println("The sum of "+n1.getNum()+" is "+n1.sumDigits());
		
	}// main()
}//TestNumber1
