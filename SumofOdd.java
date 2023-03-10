import java.util.*;
public class SumofOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int oddsum = 0;
			System.out.println("Enter the elemets into an array");
		for(int i = 0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}//for
		for(int i = 0;i<arr.length;i++){
			if(arr[i]%2!=0){
				oddsum+=arr[i];
			}//if
		}//for
		System.out.println("sum of odd numbers in an array is "+oddsum);
	}//main()
}//SumofOdd
