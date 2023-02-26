// java program to understand Scope of variables
public class Scope_Example
{
	public static void main(String[] args){
		System.out.println("This program is to understand the scope of variables");
		int i = 15;
		{
			System.out.println("We are in a new block");
			i = 10;
			int j = i*i;
			System.out.println("i and j are in new block as "+i+" "+j);
		}
		int k = i+2;
		int j = k+100;
		System.out.println("k is  "+k);
		System.out.println("i & j out of the new block are "+i+" "+j );
	}
}