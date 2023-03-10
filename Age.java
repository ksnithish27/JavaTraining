import java.util.*;
public class Age
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int below18 =0, bwt18and60=0,above60=0;
		System.out.println("Enter the no of ages ");
		int n = sc.nextInt();
		System.out.println("Enter the ages ");
		int [] arr = new int[n];
		for(int i = 0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}//for
		for(int i = 0;i<arr.length;i++){
			if(arr[i]<18){
				below18++;
			}
			else if(arr[i]>=18 && arr[i]<=60){
				bwt18and60++;
			}//elseif
			else {
				above60++;
			}
		}//for
		System.out.println("ages below 18 are "+below18);
		System.out.println("ages between 18 and 60 are "+bwt18and60);
		System.out.println("ages above 60 are "+above60);

	}//main()
}//age
