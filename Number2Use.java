// a java program to find factorial of a given number
import java.util.Scanner;
class Number2 
{
	private int n;
	public void setNum(int n){
		this.n = n;
	}//setNum()
	public int getNum(){
		return this.n;
	}//getNum()
	public long factN(){
		int temp = this.n;
		long fact = 1;
		while(temp>0){
			if(temp == 0){ 
				return fact*1 ;
			}//if
			else{
				fact = fact*temp;
				temp = temp-1;
			}//else
		}//while
		return fact;
	}//factN()
	public long productN(){
		int temp = this.n;
		long prod =1, rem;
		while(temp>0){
			rem = temp%10;
			prod = prod*rem;
			temp = temp/10;
		}//while
		return prod;
	}//productN()
}//Factorial close
public class Number2Use
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Number2 n1 = new Number2();
		System.out.println("Enter the value of number to find Factorial");
		n1.setNum(sc.nextInt());
		if(n1.getNum()<0){
			System.out.println("INVALID");
		}//if
		else{
			System.out.println("Factorial of "+n1.getNum()+" is "+n1.factN());
		}//else
		Number2 n2 = new Number2();
		System.out.println("Enter the value of number to find product of digits");
		n2.setNum(sc.nextInt());
		System.out.println("Product of "+n2.getNum()+" is "+n2.productN());
	}//main()
}//FactUse
