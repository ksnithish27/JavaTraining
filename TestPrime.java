import java.util.*;
class NumberPrime 
{
	private int num;
	public void setNum(int num){
		if(num<=1){
			return;
		}
		this.num = num;
	}//setNum
	public int getNum(){
		return this.num;
	}//getNum
	public boolean checkPrime(){
		if(this.num==1 || this.num ==2){
			return true;
		}//checkNum
		for(int i =2;i<this.num;i++){
			if(this.num%i==0){
				return false;
			}//if
		}//for
		return true;
	}//checkNum
}
public class TestPrime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no of elemnts");
		int n = sc.nextInt(),count=0;
		int arr[] = new int[n];
		NumberPrime n1 = new NumberPrime();
		for(int i = 0;i<arr.length;i++){
		System.out.println("Enter "+(i+1)+" element");
			arr[i]=sc.nextInt();
		}//for

		int[] prime = new int[n];
		for(int i = 0;i<arr.length;i++){
			n1.setNum(arr[i]);
			if(n1.checkPrime()){
				prime[i]=arr[i];
				System.out.print(prime[i]+" ");
			}//if
		}//for
	}//main()
}//TestPrime
