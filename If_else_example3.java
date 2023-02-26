// the problem is to find min pf three using another approach and also example for ifelse
import java.util.Scanner;
public class If_else_example3
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of i, j & k ");
		int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
		int min = Integer.MIN_VALUE;
		if(i==j && j==k) min = i;
		else if(i<j && i<k) min =i;
		else if(j<i && j<k) min =j;
		else  min = k;
		System.out.println("Min of "+i+" , "+j+" and "+k+" is "+min);
	}
}