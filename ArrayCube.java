import java.util.*;
public class ArrayCube  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n = sc.nextInt();
		int cube []=new int[n];
		int arr[] = new int[n];
		System.out.println("enter the elements for an array");
		for(int i =0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}//for
		System.out.println("Cube of numbers : ");
		for(int i = 0;i<arr.length;i++){
			cube[i]=arr[i]*arr[i]*arr[i];
			System.out.println(cube[i]);
		}//for
	}//main()
}//ArrayCube
