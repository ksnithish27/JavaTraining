import java.util.Scanner;
class Patterns2
{
	static void printPatternOnerow(char ch,int nc){
		for(int i =0;i<nc;i++){
			System.out.print(ch);
		}
		System.out.println();
	}
	static void printPatternDecreading(int nr, char ch){
		for(int i = nr;i>0;i--){
			printPatternOnerow(ch,i);
		}
	}

	static void printPatternIncreasing(int nr, char ch){
		for(int i = 0;i<=nr;i++){
			printPatternOnerow(ch,i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0){
			printPatternIncreasing(n/2,'*');
			printPatternDecreading(n/2,'*');

		}

		else{
			printPatternIncreasing(n/2,'*');
			printPatternDecreading(n/2+1,'*');

		}
		
	}
}
