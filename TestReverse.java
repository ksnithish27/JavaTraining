import java.util.Scanner;
class Reverse 
{
	private int n;
	public void setNum(int n){
		this.n= n;
	}//setNum()
	public int getNum(){
		return this.n;
	}//getNum()
	public int reverseNum(){
		int temp = this.n;
		int rev=0,rem;
		while(temp>0){
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}//while
		return rev;
	}
}//Reverse
public class TestReverse
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Reverse r1 = new Reverse();
		r1.setNum(sc.nextInt());
		System.out.println("The reverese of "+r1.getNum()+" is "+r1.reverseNum());
	}
}
